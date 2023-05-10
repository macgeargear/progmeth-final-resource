package logic;

public class Fighter extends Piece {
	
	private boolean promoted;
	private PositionList promotedMovePositions;

	public Fighter(int initialPositionX, int initialPositionY, boolean reverse, String name) {
		super(initialPositionX, initialPositionY, reverse, name);
		// TODO Auto-generated constructor stub
		promotedMovePositions = new PositionList();
		
		movePositions.add(-1, 2);
		movePositions.add(1, 2);
		
		promotedMovePositions.add(0, 2);
		promotedMovePositions.add(1, 0);
		promotedMovePositions.add(0, -2);
		promotedMovePositions.add(-1, 0);
		
		if (isReverse()) {

			for (int i = 0; i < movePositions.size(); i++) {
				movePositions.get(i).reverse();
			}
			
			for (int i = 0; i < promotedMovePositions.size(); i++) {
				promotedMovePositions.get(i).reverse();
			}
				
		}
		
		this.promoted = false;

	}

	@Override
	public void move(int movePattern) {
		// TODO Auto-generated method stub
		
		if (promoted) {
			setCurrentPosition(getCurrentPosition().addPositionValue(getPromotedMovePositions().get(movePattern)));
			
			//setCurrentPosition(getPromotedMovePositions().get(movePattern));
		} else {
			setCurrentPosition(getCurrentPosition().addPositionValue(getMovePositions().get(movePattern)));
		}

		getCurrentPosition().normalizedPosition();
	}

	@Override
	public Position attackTargetPosition(int actionPattern) {
		// TODO Auto-generated method stub
		Position targetPosition = this.currentPosition.addPositionValue(getMovePositions().get(actionPattern));
		targetPosition.normalizedPosition();
		move(actionPattern);
		return targetPosition;
		
		
	}

	public boolean isPromoted() {
		return promoted;
	}

	public void setPromoted(boolean promoted) {
		this.promoted = promoted;
	}

	public PositionList getPromotedMovePositions() {
		return promotedMovePositions;
	}
	
	

}
