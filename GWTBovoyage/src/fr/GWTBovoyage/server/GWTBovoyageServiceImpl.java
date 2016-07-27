package fr.GWTBovoyage.server;

import java.util.List;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import fr.GWTBovoyage.client.GWTBovoyageService;
import fr.GWTBovoyage.shared.Destination;

public class GWTBovoyageServiceImpl extends RemoteServiceServlet implements GWTBovoyageService {

	@Override
	public List<Destination> getAllDestinations() {
		// TODO Auto-generated method stub
		return null;
	}

}
