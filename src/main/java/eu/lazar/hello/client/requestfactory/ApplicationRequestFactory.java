package eu.lazar.hello.client.requestfactory;

import com.google.web.bindery.requestfactory.shared.RequestFactory;

public interface ApplicationRequestFactory extends RequestFactory {

  SystemUserRequest getSystemUserRequest();
  
}
