package com.gmail.daniel.r.heiniger.tetrominoes.composites;

import java.util.HashMap;
import java.util.Map;

public class RelativePosition extends Position{
	private static final Map<Integer, Integer> INDEX_TO_RIGHT_ROTATED_INDEX = getIndexToRightRotatedIndex();
	public static final int MAX_RELATIVE_POSITIONS = 16;
	public static final int ROW_WIDTH = 4;
	public static final int ROW_HEIGHT = 4;
	
	private int index;
	
	public RelativePosition(){
		super();
		this.index = 0;
	}
	
	public RelativePosition(int index, int x, int y){
		super(x, y);
		this.index = index;
	}
	
	public RelativePosition(int index, Position position){
		super(position);
		this.index = index;
	}
	
	public RelativePosition(RelativePosition relativePosition){
		super(relativePosition);
		this.index = relativePosition.index;		
	}
	
	public int getIndex(){
		return this.index;
	}
	
	private Integer getRightRotatedIndex(Integer index) {
		return INDEX_TO_RIGHT_ROTATED_INDEX.get(index);
	}
	
	private static Map<Integer, Integer> getIndexToRightRotatedIndex() {
		Map<Integer, Integer> indexToRightRotatedIndex = new HashMap<Integer, Integer>();
		indexToRightRotatedIndex.put(0, 3);
		indexToRightRotatedIndex.put(1, 7);
		indexToRightRotatedIndex.put(2, 11);
		indexToRightRotatedIndex.put(3, 15);
		indexToRightRotatedIndex.put(4, 2);
		indexToRightRotatedIndex.put(5, 6);
		indexToRightRotatedIndex.put(6, 10);
		indexToRightRotatedIndex.put(7, 14);
		indexToRightRotatedIndex.put(8, 1);
		indexToRightRotatedIndex.put(9, 5);
		indexToRightRotatedIndex.put(10, 9);
		indexToRightRotatedIndex.put(11, 13);
		indexToRightRotatedIndex.put(12, 0);
		indexToRightRotatedIndex.put(13, 4);
		indexToRightRotatedIndex.put(14, 8);
		indexToRightRotatedIndex.put(15, 12);

		return indexToRightRotatedIndex;
	}
	
	private RelativePosition getRightRotatedRelativePosition(){
		RelativePosition rightRotatedRelativePosition = new RelativePosition(this);
		rightRotatedRelativePosition = getAllRelativePositions(rightRotatedRelativePosition)[getRightRotatedIndex(index)];
		return rightRotatedRelativePosition;
	}
	
	public static RelativePosition[] getAllRelativePositions(RelativePosition relativePosition){
		RelativePosition[] relativePositions = getInitialPositions(relativePosition);
		for(int i = 1; i < MAX_RELATIVE_POSITIONS; i++){
			if(shouldStartNewRow(i)){
				relativePositions[i] = getRelativePositionBelow(relativePositions[getIndexAbove(i)]);
			}else{
				relativePositions[i] = getRelativePositionRightOf(relativePositions[getIndexLeftOf(i)]);
			}
		}
		
		return relativePositions;
	}
	
	
	
	private static RelativePosition[] getInitialPositions(RelativePosition relativePosition){
		RelativePosition[] relativePositions = new RelativePosition[MAX_RELATIVE_POSITIONS];
		relativePositions[0] = getRelativePositionZero(relativePosition);
		return relativePositions;
	}
	
	private static int getIndexAbove(int index){
		return index - ROW_WIDTH;
	}
	
	private static int getIndexLeftOf(int index){
		return index - 1;
	}
	
	private static boolean shouldStartNewRow(int index){
		return index % ROW_WIDTH == 0;
	}
	
	private static RelativePosition getRelativePositionZero(RelativePosition relativePosition){
		if(relativePosition.index < 0 || relativePosition.index > MAX_RELATIVE_POSITIONS){
			throw new IndexOutOfBoundsException();
		}
		
		if(relativePosition.index == 0){
			return relativePosition;
		}
			
		if(relativePosition.index <= ROW_WIDTH){
			return getRelativePositionZero(getRelativePositionLeftOf(relativePosition));
		}
		
		return getRelativePositionZero(getRelativePositionAbove(relativePosition));
	}
	
	
	public static RelativePosition getRelativePositionAbove(RelativePosition relativePosition){
		return new RelativePosition(relativePosition.getIndex() - ROW_WIDTH, 
									getPositionAbove(relativePosition));
	}
	
	public static RelativePosition getRelativePositionBelow(RelativePosition relativePosition){
		return new RelativePosition(relativePosition.getIndex() + ROW_WIDTH, 
									getPositionBelow(relativePosition));
	}
	
	public static RelativePosition getRelativePositionLeftOf(RelativePosition relativePosition){
		return new RelativePosition(relativePosition.getIndex() - 1, 
									getPositionLeftOf(relativePosition));
	}
	
	public static RelativePosition getRelativePositionRightOf(RelativePosition relativePosition){
		return new RelativePosition(relativePosition.getIndex() + 1, 
									getPositionRightOf(relativePosition));
	}	

	public RelativePosition rotateRight(){
		//TODO if no collision
		//TODO - fix this, it shouldn't matter if you call it repeatedly
		RelativePosition rightRotatedRelativePosition = getRightRotatedRelativePosition();
		index = rightRotatedRelativePosition.getIndex();
		x = rightRotatedRelativePosition.getX();
		y = rightRotatedRelativePosition.getY();
		return this;
	}
	
	@Override
	public String toString(){
		return index + ": " + getX() + ", " + getY();
	}
	
	@Override
	public boolean equals(Object rhs){
		RelativePosition comparedRelativePosition = (RelativePosition)rhs;
		return index == comparedRelativePosition.getIndex() &&
				getX() == (comparedRelativePosition.getX()) &&
				getY() == comparedRelativePosition.getY();
	}
}
