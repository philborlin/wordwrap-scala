package com.pluralsight.phone

import org.scalatest.FunSuite

class PhoneTest extends FunSuite {
	test("wrap empty string") {
	  assert(Phone.translate("000-0000") == List("000-0000"))
	  
	  assert(Phone.letters('1') == "1")
	  assert(Phone.letters('2') == "ABC")
	  assert(Phone.letters('3') == "DEF")
	  assert(Phone.letters('4') == "GHI")
	  assert(Phone.letters('5') == "JKL")
	  assert(Phone.letters('6') == "MNO")
	  assert(Phone.letters('7') == "PQRS")
	  assert(Phone.letters('8') == "TUV")
	  assert(Phone.letters('9') == "WXYZ")
	  assert(Phone.letters('0') == "0")
	  
	  assert(Phone.translate("000-0002") == List("000-000A", "000-000B","000-000C"))
	}
	
	test("factal") {
		assert(Phone.translate("372-2825").contains("FRA-CTAL"))
	}
}