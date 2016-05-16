package eu.lazar.hello.client.requestfactory.proxy;

import eu.lazar.hello.server.domain.SystemUser;

import com.google.web.bindery.requestfactory.shared.EntityProxy;
import com.google.web.bindery.requestfactory.shared.ProxyFor;

@ProxyFor(SystemUser.class)
public interface SystemUserProxy extends EntityProxy {

  Long getVersion();
  
  String getLoginUrl();
  
  String getLogoutUrl();
  
  Long getId();
  
  void setId(Long id);

  String getGoogleNickname();
  
}
