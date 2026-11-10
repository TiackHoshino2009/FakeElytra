package com.example.copperelytra;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.DefaultItemComponentEvents;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.class_10191;
import net.minecraft.class_10192;
import net.minecraft.class_10394;
import net.minecraft.class_1304;
import net.minecraft.class_1802;
import net.minecraft.class_1814;
import net.minecraft.class_1935;
import net.minecraft.class_2561;
import net.minecraft.class_2960;
import net.minecraft.class_3902;
import net.minecraft.class_5321;
import net.minecraft.class_7706;
import net.minecraft.class_9285;
import net.minecraft.class_9334;

public class CopperElytra implements ModInitializer {
   public static final String MOD_ID = "copperelytra";
   public static final class_5321<class_10394> WINGS_ONLY_ASSET;

   public void onInitialize() {
      DefaultItemComponentEvents.MODIFY.register((DefaultItemComponentEvents.ModifyCallback)(context) -> context.modify(class_1802.field_61344, (builder) -> {
            builder.method_57840(class_9334.field_54197, class_3902.field_17274);
            builder.method_57840(class_9334.field_54199, class_2960.method_60656("elytra"));
            builder.method_57840(class_9334.field_50239, class_2561.method_43471("item.minecraft.elytra"));
            builder.method_57840(class_9334.field_50073, class_1814.field_8904);
            builder.method_57840(class_9334.field_49636, class_9285.field_49326);
            class_10192 original = (class_10192)class_1802.field_61344.method_57347().method_58694(class_9334.field_54196);
            class_10192.class_10217 equippable = class_10192.method_64202(class_1304.field_6174).method_64204(WINGS_ONLY_ASSET);
            if (original != null) {
               equippable.method_64205(original.comp_3175());
            }

            builder.method_57840(class_9334.field_54196, equippable.method_64203());
         }));
      ItemGroupEvents.modifyEntriesEvent(class_7706.field_40202).register((ItemGroupEvents.ModifyEntries)(entries) -> {
         entries.getDisplayStacks().removeIf((stack) -> stack.method_31574(class_1802.field_61344));
         entries.getSearchTabStacks().removeIf((stack) -> stack.method_31574(class_1802.field_61344));
      });
      ItemGroupEvents.modifyEntriesEvent(class_7706.field_41060).register((ItemGroupEvents.ModifyEntries)(entries) -> entries.addAfter(class_1802.field_8833, new class_1935[]{class_1802.field_61344}));
   }

   static {
      WINGS_ONLY_ASSET = class_5321.method_29179(class_10191.field_55214, class_2960.method_60655("copperelytra", "copper_elytra"));
   }
}
