int[] junk_seeds = new int[]{5104, 5097, 5308, 5097, 5309, 5318, 5322, 5098, 5306, 5324, 5102, 5305, 5310, 5320, 5096, 5307,5319,5101,5099,5103,5281,5311.5281, 5311};
int[] herb_seeds = new int[]{5291,5292};
int straw_berry_seed = 5323;
int seed_box = 24482;
int foodId = 13441;
int foodId_count = v.getInventory().count(foodId);
int master_farmer_in_guild_north_east = 11493;

if(client.getBoostedSkillLevel(Skill.HITPOINTS) <= 40) {
    if (foodId_count > 0) {
        v.getVars().setBoolean("HPMONITORING", true);
        v.getInventory().eat(foodId);
        v.getCallbacks().afterTicks(1, () -> {
          v.getVars().setBoolean("HPMONITORING", false);
        });
    }
} else if (v.getInventory().inventoryFull()) {
    v.invoke("Fill","<col=ff9040>Open seed box</col>",2,57,0,9764864,false);
    for(int seed : junk_seeds) {
        v.getInventory().drop(seed);
    }
} else {
    v.invoke("Pickpocket","<col=ffff00>Master Farmer",master_farmer_in_guild_north_east,11,0,0,false);
}
