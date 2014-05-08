package trecservicetool

/**
 * Template
 * A domain class describes the data object and it's mapping to the database
 */
class Template {

    /* Default (injected) attributes of GORM */
    Long	id
    Long	version
    String header1
    String header2
    String header3
    String header4
    String header5
    String header6
    String fixpart
    String varpart
    String codeRepetitions
    String numberOfCodes
    String content2
    String content3
    String content4
    String content5
    String content6
    String labelType
	
    /* Automatic timestamping of GORM */
    Date	dateCreated
    Date	lastUpdated
	
    //	static	belongsTo	= []	// tells GORM to cascade commands: e.g., delete this object if the "parent" is deleted.
    //	static	hasOne		= []	// tells GORM to associate another domain object as an owner in a 1-1 mapping
    //	static	hasMany		= []	// tells GORM to associate other domain objects for a 1-n or n-m mapping
    //	static	mappedBy	= []	// specifies which property should be used in a mapping 
	
    static	mapping = {
           table "TST_TEMPLATE" 
    }
      
    
    static constraints = {
        fixpart(unique:true, nullable:false, blank:false)
        varpart(nullable:true)
        codeRepetitions(nullable:false, blank:false)
        numberOfCodes(nullable:false, blank:false)
        header1(nullable:false, blank:false)
        header2(nullable:true)
        header3(nullable:true)
        header4(nullable:true)
        header5(nullable:true)
        header6(nullable:true)
        content2(nullable:true)
        content3(nullable:true)
        content4(nullable:true)
        content5(nullable:true)
        content6(nullable:true)
    }
	
    /*
     * Methods of the Domain Class
     */
    //	@Override	// Override toString for a nicer / more descriptive UI 
    //	public String toString() {
    //		return "${name}";
    //	}
}
