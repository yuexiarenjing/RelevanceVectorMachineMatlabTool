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

import com.mathworks.toolbox.javabuilder.pooling.Poolable;
import java.util.List;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * The <code>estimateRemote</code> class provides a Java RMI-compliant interface to the 
 * M-functions from the files:
 * <pre>
 *  C:\\Users\\zhangwei\\Desktop\\SB2_Release_200\\RVM.m
 * </pre>
 * The {@link #dispose} method <b>must</b> be called on a <code>estimateRemote</code> 
 * instance when it is no longer needed to ensure that native resources allocated by this 
 * class are properly freed, and the server-side proxy is unexported.  (Failure to call 
 * dispose may result in server-side threads not being properly shut down, which often 
 * appears as a hang.)  
 *
 * This interface is designed to be used together with 
 * <code>com.mathworks.toolbox.javabuilder.remoting.RemoteProxy</code> to automatically 
 * generate RMI server proxy objects for instances of RVM.estimate.
 */
public interface estimateRemote extends Poolable
{
    /**
     * Provides the standard interface for calling the <code>RVM</code> M-function with 2 
     * input arguments.  
     *
     * Input arguments to standard interface methods may be passed as sub-classes of 
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of any 
     * supported Java type (i.e. scalars and multidimensional arrays of any numeric, 
     * boolean, or character type, or String). Arguments passed as Java types are 
     * converted to MATLAB arrays according to default conversion rules.
     *
     * All inputs to this method must implement either Serializable (pass-by-value) or 
     * Remote (pass-by-reference) as per the RMI specification.
     *
     * M-documentation as provided by the author of the M function:
     * <pre>
     * % 计算样本的大小
     * </pre>
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     *
     * @return Array of length nargout containing the function outputs. Outputs are 
     * returned as sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>. 
     * Each output array should be freed by calling its <code>dispose()</code> method.
     *
     * @throws java.jmi.RemoteException An error has occurred during the function call or 
     * in communication with the server.
     */
    public Object[] RVM(int nargout, Object... rhs) throws RemoteException;
  
    /** Frees native resources associated with the remote server object */
    void dispose() throws RemoteException;
}
