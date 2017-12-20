package com.gmail.daniel.r.heiniger.tetrominoes.composites;

public enum DefaultPosition {
	POSITION_ZERO(new Position(Position.getDrawingCenterXCoordinate(), 0)),
	POSITION_ONE(Position.getPositionRightOf(POSITION_ZERO.getPosition())),
	POSITION_TWO(Position.getPositionRightOf(POSITION_ONE.getPosition())),
	POSITION_THREE(Position.getPositionRightOf(POSITION_TWO.getPosition())),
	POSITION_FOUR(Position.getPositionBelow(POSITION_ZERO.getPosition())),
	POSITION_FIVE(Position.getPositionRightOf(POSITION_FOUR.getPosition())),
	POSITION_SIX(Position.getPositionRightOf(POSITION_FIVE.getPosition())),
	POSITION_SEVEN(Position.getPositionRightOf(POSITION_SIX.getPosition())),
	POSITION_EIGHT(Position.getPositionBelow(POSITION_FOUR.getPosition())),
	POSITION_NINE(Position.getPositionRightOf(POSITION_EIGHT.getPosition())),
	POSITION_TEN(Position.getPositionRightOf(POSITION_NINE.getPosition())),
	POSITION_ELEVEN(Position.getPositionRightOf(POSITION_TEN.getPosition())),
	POSITION_TWELVE(Position.getPositionBelow(POSITION_EIGHT.getPosition())),
	POSITION_THIRTEEN(Position.getPositionRightOf(POSITION_TWELVE.getPosition())),
	POSITION_FOURTEEN(Position.getPositionRightOf(POSITION_THIRTEEN.getPosition())),
	POSITION_FIFTEEN(Position.getPositionRightOf(POSITION_FOURTEEN.getPosition()));
	

	private Position position;
	
	private DefaultPosition(Position relativePosition){
		this.position = relativePosition;
	}
	
	public Position getPosition(){
		return this.position;
	}	
}
