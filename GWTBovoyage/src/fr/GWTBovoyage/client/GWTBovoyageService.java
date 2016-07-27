package fr.GWTBovoyage.client;

import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import fr.GWTBovoyage.shared.Destination;
@RemoteServiceRelativePath("GWTBovoyage")
public interface GWTBovoyageService extends RemoteService {
	List<Destination> getAllDestinations();
}
