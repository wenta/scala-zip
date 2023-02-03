package com.github.scalazip

import org.specs2.mutable._

class ZipIntegrationTest extends Specification with TestData {

  "ZipIntegrationTest" should {
    "Compress a File, and them uncompress it" in {
      val file1 = getResource("txt/lorem10.txt")
      val file2 = getResource("img/github2.jpg")
      val files = file1 :: file2 :: EmptyZip
      println(files)
      val zip = files.zipAs("./src/test/resources/stuff.zip")
      val file = zip.unzipAs("./src/test/resources/stuff")
      file.exists must_== true
    }

  }

}
