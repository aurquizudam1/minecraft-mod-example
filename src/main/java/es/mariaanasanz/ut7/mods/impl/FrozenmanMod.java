package es.mariaanasanz.ut7.mods.impl;

import es.mariaanasanz.ut7.mods.base.*;
import net.minecraftforge.client.event.MovementInputUpdateEvent;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.event.entity.player.ItemFishedEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.common.Mod;

@Mod(DamMod.MOD_ID)
public class FrozenmanMod extends DamMod implements IBlockBreakEvent, IServerStartEvent,
        IItemPickupEvent, ILivingDamageEvent, IUseItemEvent, IFishedEvent,
        IInteractEvent, IMovementEvent {

    public FrozenmanMod() { super(); }

    @Override
    public String autor() {
        return "Aimar Urquizu Diego";
    }

    @Override
    public void onBlockBreak(BlockEvent.BreakEvent event) {

    }

    @Override
    public void onPlayerFish(ItemFishedEvent event) {

    }

    @Override
    public void onPlayerTouch(PlayerInteractEvent.RightClickBlock event) {

    }

    @Override
    public void onItemPickup(EntityItemPickupEvent event) {

    }

    @Override
    public void onLivingDamage(LivingDamageEvent event) {

    }

    @Override
    public void onLivingDeath(LivingDeathEvent event) {

    }

    @Override
    public void onPlayerWalk(MovementInputUpdateEvent event) {

    }

    @Override
    public void onServerStart(ServerStartingEvent event) {

    }

    @Override
    public void onUseItem(LivingEntityUseItemEvent event) {

    }
}
