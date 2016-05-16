package eu.lazar.hello.client.requestfactory;

import eu.lazar.hello.client.requestfactory.proxy.SystemUserProxy;
import eu.lazar.hello.server.domain.SystemUser;

import com.google.web.bindery.requestfactory.shared.Request;
import com.google.web.bindery.requestfactory.shared.RequestContext;
import com.google.web.bindery.requestfactory.shared.Service;

@Service(SystemUser.class)
public interface SystemUserRequest extends RequestContext {

  Request<SystemUserProxy> findSystemUser(Long id);
  
}
