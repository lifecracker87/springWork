/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package helloFromSpring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

/**
 *
 * @author bhim
 */

@Controller

@RequestMapping(value="/hello")
public class HelloController
{
    @RequestMapping(value="/sayhello", method=RequestMethod.GET)
    public ModelAndView sayHello()
    {
        return new ModelAndView("hello","helloMsg","Hello World From Spring");
    }
    
}