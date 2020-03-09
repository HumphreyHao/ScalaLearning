package com.imooc.controller

import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod, RestController}
import org.springframework.web.context.annotation.RequestScope
@RestController
class ScalaHelloBoot {

  @RequestMapping(value = Array("/sayScalaHello"),method = Array(RequestMethod.GET))
  def sayScalaHello()={
      "Hello Scala Boot..."
  }
}
