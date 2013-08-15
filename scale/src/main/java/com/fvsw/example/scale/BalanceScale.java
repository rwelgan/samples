/**
 * 
 */
package com.fvsw.example.scale;

/**
 * @author rwelgan
 * 
 * The balance scale consists of two platforms, a left arm and a right arm.
 * 
 * There are three possible states:
 *  - Level
 *  - Heavy Left
 *  - Heavy Right
 *
 */
public class BalanceScale {
	
	BalanceStates balance = null;
	Platform leftArm = null;
	Platform rightArm = null;
	/**
	 * @return the balance
	 */
	public BalanceStates getBalance() {
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(BalanceStates balance) {
		this.balance = balance;
	}
	/**
	 * @return the leftArm
	 */
	public Platform getLeftArm() {
		return leftArm;
	}
	/**
	 * @param leftArm the leftArm to set
	 */
	public void setLeftArm(Platform leftArm) {
		this.leftArm = leftArm;
	}
	/**
	 * @return the rightArm
	 */
	public Platform getRightArm() {
		return rightArm;
	}
	/**
	 * @param rightArm the rightArm to set
	 */
	public void setRightArm(Platform rightArm) {
		this.rightArm = rightArm;
	}
	


}
