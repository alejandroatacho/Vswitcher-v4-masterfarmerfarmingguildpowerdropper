//Title: V4 AIO Master Farmer - Junk Seeds Powerdropper FarmGuild/Ardougne/Draynor
////____________________________________________________________________________________________
//Choose which master farmer in which area you want to steal from
//____________________________________________________________________________________________
//0 = Farming Guild Master Farmer, 1 = Ardougne Master Farmer, 2 draynor
int decision = 0; //0 = Farming Guild Master Farmer, 1 = Ardougne Master Farmer, 2 draynor
int[] junk_seeds = new int[]{5104, 5097, 5308, 5097, 5309, 5318, 5322, 5098, 5306, 5324, 5102, 5305, 5310, 5320, 5096, 5307,5319,5101,5099,5103,5282,5105, 5311,5281,5280, 22873}; 
// Junk Seeds Remove the seeds ID you want to keep.
int foodId = 13441; // Your Food ID incase you have some food in your inventory, you can just keep it like it is if you dont have any, it will still work
//__________________________________________________________________________________________


//Hinamizawa's Variables Don't touch!
int seed_box = 24482;
int seed_box_slot = v.getInventory().slot(seed_box);
int foodId_count = v.getInventory().count(foodId);
int master_farmer_in_guild_north_east = 11493;
int master_farmer_draynor = 17722;
int master_farmer_ardougne = 11191;

// Stuff down below
if(client.getBoostedSkillLevel(Skill.HITPOINTS) <= 40) {
    if (foodId_count > 0) {
        v.getVars().setBoolean("HPMONITORING", true);
        v.getInventory().eat(foodId);
        v.getCallbacks().afterTicks(1, () -> {
          v.getVars().setBoolean("HPMONITORING", false);
        });
    }
} else if (v.getInventory().inventoryFull()) {
if (v.getInventory().hasIn(seed_box)) {
    v.invoke("Fill","<col=ff9040>Open seed box</col>",2,57,seed_box_slot,9764864,false);
}
    for(int seed : junk_seeds) {
        v.getInventory().drop(seed);
    }
} else if (decision == 0 ){
    v.invoke("Pickpocket","<col=ffff00>Master Farmer",master_farmer_in_guild_north_east,11,0,0,false);
}
else if (decision == 1 ){
    v.invoke("Pickpocket","<col=ffff00>Master Farmer",master_farmer_ardougne,11,0,0,false);
}
else if (decision == 2 ){
    v.invoke("Pickpocket","<col=ffff00>Master Farmer",master_farmer_draynor,11,0,0,false);
}