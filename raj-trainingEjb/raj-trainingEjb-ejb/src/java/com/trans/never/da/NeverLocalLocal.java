
package com.trans.never.da;

import javax.ejb.Local;


@Local
public interface NeverLocalLocal {
   void print(String msg); 
   void printSupport(String msg);
   void printNotSupported(String msg);
}
