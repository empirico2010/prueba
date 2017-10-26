/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webtime;

import java.text.DateFormat;
import java.util.Date;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author javier
 */
@Named(value = "webtime")
@Dependent
public class Webtime {


    public String getTime(){
        return DateFormat.getTimeInstance(DateFormat.LONG).format(new Date());
    }
}

