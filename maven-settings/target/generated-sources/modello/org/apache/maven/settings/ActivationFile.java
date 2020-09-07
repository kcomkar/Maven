// =================== DO NOT EDIT THIS FILE ====================
// Generated by Modello 1.11,
// any modifications will be overwritten.
// ==============================================================

package org.apache.maven.settings;

/**
 * 
 *         
 *         This is the file specification used to activate a
 * profile. The missing value will be a the location
 *         of a file that needs to exist, and if it doesn't the
 * profile must run.  On the other hand exists will test
 *         for the existence of the file and if it is there will
 * run the profile.
 *         
 *       
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings( "all" )
public class ActivationFile
    implements java.io.Serializable, java.lang.Cloneable
{

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * 
     *             The name of the file that should be missing to
     * activate a
     *             profile.
     *           
     */
    private String missing;

    /**
     * 
     *             The name of the file that should exist to
     * activate a profile.
     *           
     */
    private String exists;


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method clone.
     * 
     * @return ActivationFile
     */
    public ActivationFile clone()
    {
        try
        {
            ActivationFile copy = (ActivationFile) super.clone();

            return copy;
        }
        catch ( java.lang.Exception ex )
        {
            throw (java.lang.RuntimeException) new java.lang.UnsupportedOperationException( getClass().getName()
                + " does not support clone()" ).initCause( ex );
        }
    } //-- ActivationFile clone()

    /**
     * Get the name of the file that should exist to activate a
     * profile.
     * 
     * @return String
     */
    public String getExists()
    {
        return this.exists;
    } //-- String getExists()

    /**
     * Get the name of the file that should be missing to activate
     * a
     *             profile.
     * 
     * @return String
     */
    public String getMissing()
    {
        return this.missing;
    } //-- String getMissing()

    /**
     * Set the name of the file that should exist to activate a
     * profile.
     * 
     * @param exists
     */
    public void setExists( String exists )
    {
        this.exists = exists;
    } //-- void setExists( String )

    /**
     * Set the name of the file that should be missing to activate
     * a
     *             profile.
     * 
     * @param missing
     */
    public void setMissing( String missing )
    {
        this.missing = missing;
    } //-- void setMissing( String )

}