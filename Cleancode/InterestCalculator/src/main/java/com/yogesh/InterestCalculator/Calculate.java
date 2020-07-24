/**
 * 
 */
package com.yogesh.InterestCalculator;

/**
 * @author yoges
 *
 */
public interface Calculate {
	public abstract double calculateSimpleInterest(double principleAmount, double time, double rateOfInterest);
	
	public abstract double calculateCompoundInterest(double principleAmount, double time, double rateOfInterest);
}
