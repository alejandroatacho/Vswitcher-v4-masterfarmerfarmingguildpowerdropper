# Thieving AIO - Master Farmer 

This script automates the thieving process at the farming guild, specifically targeting the Master Farmer NPC. When your inventory becomes full, it will drop all unwanted junk seeds. Before dropping the junk seeds, it will click "Fill" on your seed box to store your favorite seed, ensuring efficient inventory management.

This script is meant for high-level thieving for Ironman or other account types looking to acquire seeds quickly for contracts.

## Seeds
This script will not drop any herb seeds or specific seeds such as limpwurt, strawberry, or watermelon seeds. However, the following seeds may be important and will not be dropped:
- White Berries Seed (ID: 5105)
- Potato Cactus Seed (ID: 22873)

## Instructions

1. Ensure you are at the farming guild in the northeast side.
2. Start the script and let it run.
3. The script will automatically thieve the Master Farmer NPC.
4. If your inventory becomes full, it will click "Fill" on your seed box to store your favorite seed.
5. It will then proceed to drop all unwanted junk seeds from your inventory.
6. The script will continue thieving and managing your inventory automatically.

Please note that you should have the required food (specified by `foodId`) in your inventory to restore health if your Hitpoints level falls below 40.

## Script Details

- `decision`: Choose the Master Farmer you want to steal from:
  - 0: Farming Guild Master Farmer
  - 1: Ardougne Master Farmer
  - 2: Draynor Master Farmer
- `foodId`: The ID of the food item to restore health.
- `junk_seeds`: An array containing the IDs of junk seeds to be dropped.
