package com.pluralsight.wordwrap

object WordWrap extends Application {
	def wrap(string: String, length: Int): String = {
	  val spaceIndex = string.substring(0, if (length <= string.length) length else string.length).lastIndexOf(" ")
		val breakOnSpace = if (spaceIndex < 0) length else spaceIndex
		
	  if (string.length <= length) string
	  else f"${string.substring(0, breakOnSpace)}\n${wrap(string.substring(breakOnSpace).trim, length)}"
	}
}