package com.pluralsight.wordwrap

import org.scalatest.FunSuite

class WordWrapTest extends FunSuite {
	test("wrap empty string") {
	  assert(WordWrap.wrap("", 1) == "")
	  assert(WordWrap.wrap("a", 1) == "a")
	  assert(WordWrap.wrap("aa", 1) == "a\na")
	  assert(WordWrap.wrap("ba", 1) == "b\na")
	  assert(WordWrap.wrap("ab", 1) == "a\nb")
	  assert(WordWrap.wrap("aab", 2) == "aa\nb")
	  assert(WordWrap.wrap("aaa", 1) == "a\na\na")
	  assert(WordWrap.wrap("a a", 1) == "a\na")
	  assert(WordWrap.wrap("a aa", 3) == "a\naa")
	  assert(WordWrap.wrap("a a aa", 5) == "a a\naa")
	  assert(WordWrap.wrap("we democratize technical training", 6) == "we\ndemocr\natize\ntechni\ncal\ntraini\nng")
  }
}