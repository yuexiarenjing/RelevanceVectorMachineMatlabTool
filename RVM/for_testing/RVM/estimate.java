/*
 * MATLAB Compiler: 6.0 (R2015a)
 * Date: Wed Apr 19 22:19:21 2017
 * Arguments: "-B" "macro_default" "-W" "java:RVM,estimate" "-T" "link:lib" "-d" 
 * "C:\\Users\\zhangwei\\Desktop\\SB2_Release_200\\RVM\\for_testing" 
 * "class{estimate:C:\\Users\\zhangwei\\Desktop\\SB2_Release_200\\RVM.m}" "-a" 
 * "C:\\Users\\zhangwei\\Desktop\\SB2_Release_200\\SB2_ControlSettings.m" "-a" 
 * "C:\\Users\\zhangwei\\Desktop\\SB2_Release_200\\SB2_Diagnostic.m" "-a" 
 * "C:\\Users\\zhangwei\\Desktop\\SB2_Release_200\\SB2_FormatTime.m" "-a" 
 * "C:\\Users\\zhangwei\\Desktop\\SB2_Release_200\\SB2_FullStatistics.m" "-a" 
 * "C:\\Users\\zhangwei\\Desktop\\SB2_Release_200\\SB2_Initialisation.m" "-a" 
 * "C:\\Users\\zhangwei\\Desktop\\SB2_Release_200\\SB2_Likelihoods.m" "-a" 
 * "C:\\Users\\zhangwei\\Desktop\\SB2_Release_200\\SB2_ParameterSettings.m" "-a" 
 * "C:\\Users\\zhangwei\\Desktop\\SB2_Release_200\\SB2_PosteriorMode.m" "-a" 
 * "C:\\Users\\zhangwei\\Desktop\\SB2_Release_200\\SB2_PreProcessBasis.m" "-a" 
 * "C:\\Users\\zhangwei\\Desktop\\SB2_Release_200\\SB2_Sigmoid.m" "-a" 
 * "C:\\Users\\zhangwei\\Desktop\\SB2_Release_200\\SB2_UserOptions.m" "-a" 
 * "C:\\Users\\zhangwei\\Desktop\\SB2_Release_200\\SparseBayes.m" 
 */

package RVM;

import com.mathworks.toolbox.javabuilder.*;
import com.mathworks.toolbox.javabuilder.internal.*;
import java.util.*;

/**
 * The <code>estimate</code> class provides a Java interface to the M-functions
 * from the files:
 * <pre>
 *  C:\\Users\\zhangwei\\Desktop\\SB2_Release_200\\RVM.m
 * </pre>
 * The {@link #dispose} method <b>must</b> be called on a <code>estimate</code> instance 
 * when it is no longer needed to ensure that native resources allocated by this class 
 * are properly freed.
 * @version 0.0
 */
public class estimate extends MWComponentInstance<estimate>
{
    /**
     * Tracks all instances of this class to ensure their dispose method is
     * called on shutdown.
     */
    private static final Set<Disposable> sInstances = new HashSet<Disposable>();

    /**
     * Maintains information used in calling the <code>RVM</code> M-function.
     */
    private static final MWFunctionSignature sRVMSignature =
        new MWFunctionSignature(/* max outputs = */ 2,
                                /* has varargout = */ false,
                                /* function name = */ "RVM",
                                /* max inputs = */ 2,
                                /* has varargin = */ false);

    /**
     * Shared initialization implementation - private
     */
    private estimate (final MWMCR mcr) throws MWException
    {
        super(mcr);
        // add this to sInstances
        synchronized(estimate.class) {
            sInstances.add(this);
        }
    }

    /**
     * Constructs a new instance of the <code>estimate</code> class.
     */
    public estimate() throws MWException
    {
        this(RVMMCRFactory.newInstance());
    }
    
    private static MWComponentOptions getPathToComponentOptions(String path)
    {
        MWComponentOptions options = new MWComponentOptions(new MWCtfExtractLocation(path),
                                                            new MWCtfDirectorySource(path));
        return options;
    }
    
    /**
     * @deprecated Please use the constructor {@link #estimate(MWComponentOptions componentOptions)}.
     * The <code>com.mathworks.toolbox.javabuilder.MWComponentOptions</code> class provides API to set the
     * path to the component.
     * @param pathToComponent Path to component directory.
     */
    public estimate(String pathToComponent) throws MWException
    {
        this(RVMMCRFactory.newInstance(getPathToComponentOptions(pathToComponent)));
    }
    
    /**
     * Constructs a new instance of the <code>estimate</code> class. Use this constructor 
     * to specify the options required to instantiate this component.  The options will 
     * be specific to the instance of this component being created.
     * @param componentOptions Options specific to the component.
     */
    public estimate(MWComponentOptions componentOptions) throws MWException
    {
        this(RVMMCRFactory.newInstance(componentOptions));
    }
    
    /** Frees native resources associated with this object */
    public void dispose()
    {
        try {
            super.dispose();
        } finally {
            synchronized(estimate.class) {
                sInstances.remove(this);
            }
        }
    }
  
    /**
     * Invokes the first m-function specified by MCC, with any arguments given on
     * the command line, and prints the result.
     */
    public static void main (String[] args)
    {
        try {
            MWMCR mcr = RVMMCRFactory.newInstance();
            mcr.runMain( sRVMSignature, args);
            mcr.dispose();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
    
    /**
     * Calls dispose method for each outstanding instance of this class.
     */
    public static void disposeAllInstances()
    {
        synchronized(estimate.class) {
            for (Disposable i : sInstances) i.dispose();
            sInstances.clear();
        }
    }

    /**
     * Provides the interface for calling the <code>RVM</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % 计算样本的大小
     * </pre>
     * </p>
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void RVM(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sRVMSignature);
    }

    /**
     * Provides the interface for calling the <code>RVM</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % 计算样本的大小
     * </pre>
     * </p>
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void RVM(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sRVMSignature);
    }

    /**
     * Provides the standard interface for calling the <code>RVM</code>
     * M-function with 2 input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % 计算样本的大小
     * </pre>
     * </p>
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] RVM(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sRVMSignature), 
                    sRVMSignature);
        return lhs;
    }
}
