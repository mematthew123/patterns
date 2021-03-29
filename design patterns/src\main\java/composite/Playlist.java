package composite;

import java.util.ArrayList;

public class Playlist implements IComponent {

	private static final String String = null;
	public String playlistName;
	public ArrayList<IComponent> playlist = new ArrayList();

	public Playlist(String playlistName) {
		this.playlistName = playlistName;
		
		
	}

	
	
	public void add(IComponent component) {
  		 playlist.add(component);
}
	
	public void remove(IComponent component) {
		playlist.remove(component);
	}
	
	
	public void play(){
		for(IComponent component : playlist) {
			component.play();
	    	}
	}
	

	public void setPlaybackSpeed(float speed) {
	      for(IComponent component : this.playlist){
		component.setPlaybackSpeed(speed);
	    }}
	      
	      
	     



	
	public java.lang.String getName() {
		// TODO Auto-generated method stub
		return this.playlistName;
	}

  // Your code goes here!


}