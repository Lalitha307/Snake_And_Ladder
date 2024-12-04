# Snake and Ladder Simulator  

## Overview  
This program simulates a Snake and Ladder game where players roll a die, encounter snakes and ladders, and race to position 100.  

## Features  
1. **Single Player Game**: Player starts at position 0 and rolls the die to progress.  
2. **Die Roll Logic**: Random die roll (1-6).  
3. **Game Options**:  
   - **No Play**: Stay in the same position.  
   - **Ladder**: Move forward by the die roll.  
   - **Snake**: Move backward by the die roll.  
4. **Exact Win**: Player must land exactly on position 100 to win.  
5. **Two Player Mode**: Players take turns; ladders allow an extra turn.  

## Rules  
- Player restarts at 0 if position goes below 0.  
- If the position exceeds 100, the player remains in the same spot until rolling the exact number to reach 100.  

## Output  
- Reports number of dice rolls and positions after each roll.  
- Declares the winner in two-player mode.  
