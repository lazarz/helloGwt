package eu.lazar.hello.client.activity;

import eu.lazar.hello.client.ClientFactory;
import eu.lazar.hello.client.application.home.HomeActivity;
import eu.lazar.hello.client.application.home.HomePlace;
import eu.lazar.hello.client.application.login.LoginActivity;
import eu.lazar.hello.client.application.login.LoginPlace;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;

public class ApplicationActivityMapper implements ActivityMapper {
  
  private ClientFactory clientFactory;

  /**
   * AppActivityMapper associates each Place with its corresponding
   * {@link Activity}
   * 
   * @param clientFactory Factory to be passed to activities
   * @param walleteditview 
   * @param walletlistview 
   * @param signinview 
   */
  public ApplicationActivityMapper(ClientFactory clientFactory) {
    super();
    
    this.clientFactory = clientFactory;
  }
  
  /**
   * Map each Place to its corresponding Activity. 
   */
  @Override
  public Activity getActivity(Place place) {
    Activity activity = null;
    System.out.println();
    if (place instanceof HomePlace) {
      activity = new HomeActivity((HomePlace) place, clientFactory);
    } else if (place instanceof LoginPlace) {
      activity = new LoginActivity((LoginPlace) place, clientFactory);
    }
    
    clientFactory.track();
    
    return activity;
  }

}
