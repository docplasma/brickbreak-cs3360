package edu.troy.cs3360.fall2013.team1.brickbreak;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.brickbreak.R;
/**
 * This fragment acts as the container for the game engine.
 * 
 * @author Dexter parks
 * @version 1.0
 * @since 12-2-2013
 */
public class EngineFragment extends Fragment {
	
	//-----Interfaces
	/**
	 * This interface acts as a liaison between an EngineFragment instance and the hosting acitivy
	 * 
	 * @author Dexter Parks
	 * @version 1.0
	 * @since 12-2-2013
	 */
	public interface onScoreUpdateListener {
		public void onScoreUpdate(int deltaScore);
		public void onLivesUpdate(int deltaLives);
	}
	
	//------Data members
	onScoreUpdateListener mCallBack;
	
	//-----Life Cycle callback methods
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.activity_score_fragment, container, false);
		return view;
		
	}
	
	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		
		try {
			//Attempts to bind the activity to the call back activity.
            mCallBack = (onScoreUpdateListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnScoreUpdate");
        }
	}

	//-----Public Interfaces
	/**
	 * Method acts as an interface to send a score update
	 * from the an Engine instance to the hosting activity.
	 * 
	 * @author Dexter Parks
	 * @version 1.0
	 * @param deltaScore
	 */
	public void updateScore(int deltaScore) {
		mCallBack.onScoreUpdate(deltaScore);
		
	}

	/**
	 * Method acts as an interface to send a live update
	 * from the an Engine instance to the hosting activity.
	 * 
	 * @author Dexter Parks
	 * @version 1.0
	 * @param deltaScore
	 */
	public void updateLives(int deltaLives) {
		mCallBack.onLivesUpdate(deltaLives);
		
	}
}
