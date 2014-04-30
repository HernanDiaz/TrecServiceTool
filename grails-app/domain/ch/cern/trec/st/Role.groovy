package ch.cern.trec.st

class Role {

	String authority

	static mapping = {
		cache true
	}

	static constraints = {
		authority blank: false, unique: true
	}
        
        String toString() {
             return this.authority;
        }
}
