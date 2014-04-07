package com.pluralsight.phone

object Phone {
	def translate(phoneNumber: String) : Seq[String] = {
	  def translate(prefix: String, phoneNumber: String) : Seq[String] = {
	    if (phoneNumber.isEmpty()) List(prefix)
	    else letters(phoneNumber.head) flatMap { letter => translate(prefix + letter, phoneNumber.tail) }
	  }
	  
	  translate("", phoneNumber)
	}
	
//	def continuation(phoneNumber: String) : 
	
	def letters(number : Char) : String = {
	  number match {
	    case '2' => "ABC"
	    case '3' => "DEF"
	    case '4' => "GHI"
	    case '5' => "JKL"
	    case '6' => "MNO"
	    case '7' => "PQRS"
	    case '8' => "TUV"
	    case '9' => "WXYZ"
	    case _ => number.toString
	  }
	}
}