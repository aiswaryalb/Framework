/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import com.opensymphony.xwork2.ActionSupport;
import java.io.File;
import javax.servlet.ServletContext;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.util.ServletContextAware;

/**
 *
 * @author Aiswarya
 */
public class FileUploadAction extends ActionSupport implements ServletContextAware{
    private File userImage;
    private String userImageContentType;
    private String userImageFileName;
    private ServletContext servletContext;

    public ServletContext getServletContext() {
        return servletContext;
    }

    public void setServletContext(ServletContext servletContext) {
        this.servletContext = servletContext;
    }

    public String getUserImageFileName() {
        return userImageFileName;
    }

    public void setUserImageFileName(String userImageFileName) {
        this.userImageFileName = userImageFileName;
    }
	
        
    public String getUserImageContentType() {
        return userImageContentType;
    }

    public void setUserImageContentType(String userImageContentType) {
        this.userImageContentType = userImageContentType;
    }
	

    public File getUserImage() {
        return userImage;
    }

    public void setUserImage(File userImage) {
        this.userImage = userImage;
    }
    
      public String execute()
      {
          try {
              
              String filepath =servletContext.getRealPath("/").concat("images");
              System.out.println("Image location : "+filepath);
              File fileToCreate =new File(filepath,this.userImageFileName);
              FileUtils.copyFile(this.userImage,fileToCreate);
          } catch (Exception e) {
              e.printStackTrace();
              addActionError(e.getMessage());
              return INPUT;
          }
          return SUCCESS;
      }
    
}
