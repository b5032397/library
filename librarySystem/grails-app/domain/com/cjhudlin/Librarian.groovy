package com.cjhudlin

class Librarian {

String name

String email

String office

String userName

String password

int telephone

Library library

String toString() {
	return name
}

    static constraints = {

	name blank:false, nullable:false

	email blank:false, nullable:false, email:true

	office blank:false, nullable:false

	userName blank:false, nullable:false

	password blank:false, nullable:false, password:true

	telephone blank:false, nullable:false, minSize:11, maxSize:11

	library blank:false, nullable:false, maxSize:30

    }
}
