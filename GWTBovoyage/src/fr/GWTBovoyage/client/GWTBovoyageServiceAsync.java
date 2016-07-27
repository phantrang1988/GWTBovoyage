package fr.GWTBovoyage.client;

import java.util.List;

import com.google.gwt.user.client.rpc.AsyncCallback;

import fr.GWTBovoyage.shared.Destination;

public interface GWTBovoyageServiceAsync {

	void getAllDestinations(AsyncCallback<List<Destination>> callback);

}
