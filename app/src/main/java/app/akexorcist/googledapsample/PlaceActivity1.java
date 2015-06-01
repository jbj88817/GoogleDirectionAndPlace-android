/*
 * Copyright (c) 2013 Akexorcist
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package app.akexorcist.googledapsample;

import java.util.ArrayList;

import org.w3c.dom.Document;

import android.app.Activity;
import android.content.ContentValues;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import app.akexorcist.gdaplibrary.GooglePlaceSearch;
import app.akexorcist.gdaplibrary.GooglePlaceSearch.OnPlaceResponseListener;
import app.akexorcist.gdaplibrary.PlaceType;

public class PlaceActivity1 extends Activity {
	
	final String ApiKey = "AIzaSyDQ6mA6vUHD3cMNqDoblES6q3dFHzNLqs4";
	
    double latitude = 13.730354;
	double longitude = 100.569701;
	int radius = 1000;
	String type = PlaceType.FOOD;
	String language = "en";
	String keyword = "japan restaurant food";
	
	TextView textStatus;
	ListView listView;
	
	GooglePlaceSearch gp;
	
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_1);

        textStatus = (TextView)findViewById(R.id.textStatus);
        
        listView = (ListView)findViewById(R.id.listView);
        
        gp = new GooglePlaceSearch(ApiKey);
		gp.setOnPlaceResponseListener(new OnPlaceResponseListener() {
			public void onResponse(String status, ArrayList<ContentValues> arr_data,
					Document doc) {
				textStatus.setText("Status : " + status);
				
				if(status.equals(GooglePlaceSearch.STATUS_OK)) {
					ArrayList<String> array = new ArrayList<String>();
					
					for(int i = 0 ; i < arr_data.size() ; i++) {
						array.add("Name : " + arr_data.get(i).getAsString(GooglePlaceSearch.PLACE_NAME) + "\n"
								+ "Address : " + arr_data.get(i).getAsString(GooglePlaceSearch.PLACE_ADDRESS) + "\n"
								+ "Latitude : " + arr_data.get(i).getAsString(GooglePlaceSearch.PLACE_LATITUDE) + "\n"
								+ "Longitude : " + arr_data.get(i).getAsString(GooglePlaceSearch.PLACE_LONGITUDE) + "\n"
								+ "Phone Number : " + arr_data.get(i).getAsString(GooglePlaceSearch.PLACE_PHONENUMBER));
					}

					ArrayAdapter<String> adapter = new ArrayAdapter<String>(PlaceActivity1.this
							, R.layout.listview_text, array);
					listView.setAdapter(adapter);
				}
			}
		});
		
        gp.getNearby(latitude, longitude, radius, type, language, keyword);
		//gp.getTextSearch(keyword, type, false, language);
        //gp.getRadarSearch(latitude, longitude, radius, type, language, false, keyword);
	}
}
