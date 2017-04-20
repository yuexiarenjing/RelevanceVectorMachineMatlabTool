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

/**
 * <i>INTERNAL USE ONLY</i>
 */
public class RVMMCRFactory
{
   
    
    /** Component's uuid */
    private static final String sComponentId = "RVM_9D11A560439442FF92B8F9DA079904F3";
    
    /** Component name */
    private static final String sComponentName = "RVM";
    
   
    /** Pointer to default component options */
    private static final MWComponentOptions sDefaultComponentOptions = 
        new MWComponentOptions(
            MWCtfExtractLocation.EXTRACT_TO_CACHE, 
            new MWCtfClassLoaderSource(RVMMCRFactory.class)
        );
    
    
    private RVMMCRFactory()
    {
        // Never called.
    }
    
    public static MWMCR newInstance(MWComponentOptions componentOptions) throws MWException
    {
        if (null == componentOptions.getCtfSource()) {
            componentOptions = new MWComponentOptions(componentOptions);
            componentOptions.setCtfSource(sDefaultComponentOptions.getCtfSource());
        }
        return MWMCR.newInstance(
            componentOptions, 
            RVMMCRFactory.class, 
            sComponentName, 
            sComponentId,
            new int[]{8,5,0}
        );
    }
    
    public static MWMCR newInstance() throws MWException
    {
        return newInstance(sDefaultComponentOptions);
    }
}
