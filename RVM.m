function [ y, Tnext ] = RVM( Origin_Input, Learn_Size)
% 计算样本的大小
Sample_Size = numel(Origin_Input) - Learn_Size;
% 初始化输入
Input = zeros(Sample_Size, Learn_Size);
for i = 1 : Sample_Size
    for j = 1 : Learn_Size
        Input(i, j) = Origin_Input(i - 1 + j);
    end
end
Output = zeros(Sample_Size, 1);
for i = 1 : Sample_Size
    Output(i) = Origin_Input(i + Learn_Size);
end
LastInput = zeros(Learn_Size, 1);
for i = 1 : Learn_Size
    LastInput(i) = Origin_Input(Sample_Size + i);
end
[PARAMETER, ~, ~] = SparseBayes('Gaussian', Input, Output);
M = size(Input, 2);
w_infer	= zeros(M,1);
w_infer(PARAMETER.Relevant)	= PARAMETER.Value;
y = Input * w_infer;
Tnext = LastInput' * w_infer;
end

