package model.fox;

import model.Animal;
import model.AnimalBehaviourStrategy;
import controller.Area;

public class FoxBehaviour implements AnimalBehaviourStrategy {
	private static final int MAX_AGE = 5 * 365; // max age in days. Make dynamic later on.
	public static final int STARTING_DYING_OF_AGING = 4*365;
	
	private Fox rabbit;
	private Area area;

	public FoxBehaviour(Area area) {
		super();
		this.area = area;
	}
	
	public void setAnimal(Animal animal) {
		this.rabbit = (Fox) animal;
	}

	@Override
	public Fox[] reproduce(Animal partner) {
		return null;
	}

	@Override
	public void move() {
		// Primitive implementation of move. As long as there's no rabbit of 
		// the opposite sex within 5m, increase the chance of moving towards the
		// closest
		Fox nearestPartner = (Fox) rabbit.getClosestDifferentSex();
		if (Math.random() < 0.1) {
			long deltaX = Math.round(Math.random() * 3) - 1;
			long deltaY = Math.round(Math.random() * 3) - 1;
			if (nearestPartner.getLocation().getDistance(rabbit.getLocation()) > 5) {
				if (Math.random() < 0.5) {
					int directionX = Long.signum(nearestPartner.getLocation().getX() - rabbit.getLocation().getX());
					int directionY = Long.signum(nearestPartner.getLocation().getY() - rabbit.getLocation().getY());
					deltaX = deltaX + (2 * directionX);
					deltaY = deltaY + (2 * directionY);
				}
				else {
					
				}
			}
			rabbit.getLocation().move(deltaX, deltaY);
		}
	}

	@Override
	public int getMaxAge() {
		return MAX_AGE;
	}
	
	public boolean hasToDie() {
		if (rabbit.getCurrentAgeInDays() < STARTING_DYING_OF_AGING) {
			return false;
		}
		else {
			double chanceOfDying = (double) (((double) rabbit.getCurrentAgeInDays() -(double) STARTING_DYING_OF_AGING + 1.0d) / ((double) MAX_AGE - (double) STARTING_DYING_OF_AGING));
			if (Math.random() < chanceOfDying) {
				return true;
			}
			else {
				return false;
			}
		}
	}
}