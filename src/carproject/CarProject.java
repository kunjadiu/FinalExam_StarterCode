/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
  December 10th,2019 */
package carproject;

import java.util.ArrayList;

/**
 *
 * @author srinivsi
 */
public class CarProject
{
public String shopName= "Sheridan";
    private ArrayList<String> luxuryparts = new ArrayList();
    
    public void load(String parts) 
        {
	luxuryparts.add(parts);
        }

	
	public void label(String label) 
        {
	shopName=label;
        }
       
}
