package com.XHxinhe.aliveandwell.util;

import com.XHxinhe.aliveandwell.AliveAndWellMain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.fabricmc.loader.impl.FabricLoaderImpl;

public class ModsChect {
    public FabricLoaderImpl loader;
    private final Collection<String> names;
    private final Collection<String> namesServer;

    public ModsChect() {
        this.loader = FabricLoaderImpl.INSTANCE;
        this.names = new ArrayList();
        this.namesServer = new ArrayList();
    }

    public boolean chectMods() {
        Collection<ModContainer> mods = this.loader.getAllMods();
        Iterator var2 = mods.iterator();

        while(var2.hasNext()) {
            ModContainer mod = (ModContainer)var2.next();
            String name = mod.getMetadata().getId();
            this.names.add(name);
            if (AliveAndWellMain.canCreative) {
                AliveAndWellMain.LOGGER.info(name + "==================================");
            }
        }

        if ("v4.1.3".contains("-modrinth")) {
            return this.modrinth(this.names) && ((ModContainer)FabricLoader.getInstance().getModContainer("darkfear").get()).getMetadata().getVersion().toString().equals("1.0.2");
        } else {
            return this.normal(this.names) && ((ModContainer)FabricLoader.getInstance().getModContainer("darkfear").get()).getMetadata().getVersion().toString().equals("1.0.2");
        }
    }

    public boolean chectModsServer() {
        Collection<ModContainer> mods = this.loader.getAllMods();
        Iterator var2 = mods.iterator();

        while(var2.hasNext()) {
            ModContainer mod = (ModContainer)var2.next();
            String name = mod.getMetadata().getId();
            this.namesServer.add(name);
            if (AliveAndWellMain.canCreative) {
                AliveAndWellMain.LOGGER.info(name + "###########################");
            }
        }

        if ("v4.1.3".contains("-modrinth")) {
            return this.modrinth(this.namesServer) && ((ModContainer)FabricLoader.getInstance().getModContainer("darkfear").get()).getMetadata().getVersion().toString().equals("1.0.2");
        } else {
            return this.server(this.namesServer) && ((ModContainer)FabricLoader.getInstance().getModContainer("darkfear").get()).getMetadata().getVersion().toString().equals("1.0.2");
        }
    }

    public boolean normal(Collection<String> names) {
        return  names.contains("achiopt") && names.contains("ad_astra") && names.contains("additionalentityattributes") && names.contains("advanced_runtime_resource_pack")
                && names.contains("advancedbackups") && names.contains("adventurez") && names.contains("ae2") && names.contains("aftershock")
                && names.contains("aliveandwell") && names.contains("alternate-current") && names.contains("anvilrestoration") && names.contains("appleskin")
                && names.contains("arachnids") && names.contains("architectury") && names.contains("arrowhead") && names.contains("attributefix")
                && names.contains("awesomedungeon") && names.contains("awesomedungeonnether") && names.contains("azurelib") && names.contains("badpackets")
                && names.contains("balm-fabric") && names.contains("benched") && names.contains("bettercombat") && names.contains("betterfpsdist")
                && names.contains("betterstats") && names.contains("blue_endless_jankson") && names.contains("bookshelf") && names.contains("bosses_of_mass_destruction")
                && names.contains("botania") && names.contains("botarium") && names.contains("bowinfinityfix") && names.contains("caffeineconfig")
                && names.contains("cardinal-components") && names.contains("cardinal-components-base") && names.contains("cardinal-components-block") && names.contains("cardinal-components-chunk")
                && names.contains("cardinal-components-entity") && names.contains("cardinal-components-item") && names.contains("cardinal-components-level")
                && names.contains("cardinal-components-scoreboard") && names.contains("cardinal-components-world") && names.contains("cavespiderspawn")
                && names.contains("charmofundying") && names.contains("chunky") && names.contains("cleancut") && names.contains("cloth-basic-math")
                && names.contains("cloth-config") && names.contains("collective") && names.contains("com_electronwill_night-config_core")
                && names.contains("com_electronwill_night-config_toml") && names.contains("com_eliotlash_mclib_mclib")
                && names.contains("com_google_code_findbugs_jsr305") && names.contains("com_teamresourceful_bytecodecs")
                && names.contains("com_teamresourceful_yabn") && names.contains("com_twelvemonkeys_common_common-image")
                && names.contains("com_twelvemonkeys_common_common-io") && names.contains("com_twelvemonkeys_common_common-lang")
                && names.contains("com_twelvemonkeys_imageio_imageio-core") && names.contains("com_twelvemonkeys_imageio_imageio-metadata")
                && names.contains("com_twelvemonkeys_imageio_imageio-webp") && names.contains("com_velocitypowered_velocity-native")
                && names.contains("combatroll") && names.contains("configuration") && names.contains("connectivity") && names.contains("coroutil")
                && names.contains("create") && names.contains("createaddition") && names.contains("creeperoverhaul") && names.contains("crowdin-translate")
                && names.contains("cull-less-leaves") && names.contains("cupboard") && names.contains("cursery") && names.contains("customportalapi")
                && names.contains("customskinloader") && names.contains("darkfear") && names.contains("deeperdarker") && names.contains("diet")
                && names.contains("disable_custom_worlds_advice") && names.contains("doom") && names.contains("dragonfight") && names.contains("dragonloot")
                && names.contains("dripstone_fluid_lib") && names.contains("dungeons_arise") && names.contains("dungeons_arise_seven_seas")
                && names.contains("earthtojavamobs") && names.contains("eldritch_mobs") && names.contains("elytraslot") && names.contains("enchdesc")
                && names.contains("endrem") && names.contains("enhancedblockentities") && names.contains("entityculling") && names.contains("error_notifier")
                && names.contains("euphonium") && names.contains("explosiveenhancement") && names.contains("extendedae") && names.contains("extensibleenums")
                && names.contains("extra_details") && names.contains("fabric-api") && names.contains("fabric-api-base") && names.contains("fabric-api-lookup-api-v1")
                && names.contains("fabric-biome-api-v1") && names.contains("fabric-block-api-v1") && names.contains("fabric-block-view-api-v2")
                && names.contains("fabric-blockrenderlayer-v1") && names.contains("fabric-client-tags-api-v1") && names.contains("fabric-command-api-v1")
                && names.contains("fabric-command-api-v2") && names.contains("fabric-commands-v0") && names.contains("fabric-containers-v0")
                && names.contains("fabric-content-registries-v0") && names.contains("fabric-convention-tags-v1") && names.contains("fabric-crash-report-info-v1")
                && names.contains("fabric-data-attachment-api-v1") && names.contains("fabric-data-generation-api-v1") && names.contains("fabric-dimensions-v1")
                && names.contains("fabric-entity-events-v1") && names.contains("fabric-events-interaction-v0") && names.contains("fabric-events-lifecycle-v0")
                && names.contains("fabric-game-rule-api-v1") && names.contains("fabric-item-api-v1") && names.contains("fabric-item-group-api-v1")
                && names.contains("fabric-key-binding-api-v1") && names.contains("fabric-keybindings-v0") && names.contains("fabric-language-kotlin")
                && names.contains("fabric-lifecycle-events-v1") && names.contains("fabric-loot-api-v2") && names.contains("fabric-loot-tables-v1")
                && names.contains("fabric-message-api-v1") && names.contains("fabric-mining-level-api-v1") && names.contains("fabric-model-loading-api-v1")
                && names.contains("fabric-models-v0") && names.contains("fabric-networking-api-v1") && names.contains("fabric-networking-v0")
                && names.contains("fabric-object-builder-api-v1") && names.contains("fabric-particles-v1") && names.contains("fabric-permissions-api-v0")
                && names.contains("fabric-recipe-api-v1") && names.contains("fabric-registry-sync-v0") && names.contains("fabric-renderer-api-v1")
                && names.contains("fabric-renderer-indigo") && names.contains("fabric-renderer-registries-v1") && names.contains("fabric-rendering-data-attachment-v1")
                && names.contains("fabric-rendering-fluids-v1") && names.contains("fabric-rendering-v0") && names.contains("fabric-rendering-v1")
                && names.contains("fabric-resource-conditions-api-v1") && names.contains("fabric-resource-loader-v0") && names.contains("fabric-screen-api-v1")
                && names.contains("fabric-screen-handler-api-v1") && names.contains("fabric-sound-api-v1") && names.contains("fabric-transfer-api-v1")
                && names.contains("fabric-transitive-access-wideners-v1") && names.contains("fabricloader") && names.contains("fabricshieldlib")
                && names.contains("ferritecore") && names.contains("fiber") && names.contains("flywheel") && names.contains("folk_sisby_kaleido-config")
                && names.contains("forgeconfigapiport") && names.contains("fractal") && names.contains("ftblibrary") && names.contains("ftbquests")
                && names.contains("ftbteams") && names.contains("ftbxmodcompat") && names.contains("geckolib") && names.contains("gitbm") && names.contains("gpumemleakfix")
                && names.contains("here-be-no-dragons") && names.contains("human_reborn") && names.contains("huskspawn") && names.contains("illagerinvasion")
                && names.contains("immediatelyfast") && names.contains("immersive_aircraft") && names.contains("immersive_melodies") && names.contains("improvedmobs")
                && names.contains("imst") && names.contains("indium") && names.contains("ingameime") && names.contains("inmis") && names.contains("inmisaddon")
                && names.contains("inventoryhud") && names.contains("inventoryprofilesnext") && names.contains("io_github_douira_glsl-transformer") && names.contains("iris")
                && names.contains("java") && names.contains("javax_annotation_javax_annotation-api") && names.contains("javazoom_jlayer") && names.contains("jecharacters")
                && names.contains("kaffees_dual_ride") && names.contains("kirin") && names.contains("krypton") && names.contains("kubejs") && names.contains("lanserverproperties")
                && names.contains("levelz") && names.contains("libipn") && names.contains("libraryferret") && names.contains("libz") && names.contains("lithium")
                && names.contains("lootr") && names.contains("lunar") && names.contains("maelstrom_library") && names.contains("magna") && names.contains("matchbooks")
                && names.contains("mc249136") && names.contains("mcdw") && names.contains("memoryclearermissnotoredict") && names.contains("memoryleakfix")
                && names.contains("midnightlib") && names.contains("milk") && names.contains("minecells") && names.contains("minecraft") && names.contains("mixinextras")
                && names.contains("mkb") && names.contains("mm") && names.contains("mobtimizations") && names.contains("mobz") && names.contains("modern_industrialization")
                && names.contains("modernfix") && names.contains("modifiers") && names.contains("monolib") && names.contains("movingelevators")
                && names.contains("mr_camps_castles_carriages") && names.contains("mr_reds_morestructures") && names.contains("mr_ships") && names.contains("mr_true_ending")
                && names.contains("multipart_entities") && names.contains("mythicmounts") && names.contains("nametagtweaks") && names.contains("nebulus_cherry_blossem_tree")
                && names.contains("net_lenni0451_reflect") && names.contains("nice_boat") && names.contains("nicer-skies") && names.contains("no-telemetry")
                && names.contains("noindium") && names.contains("noisium") && names.contains("notenoughanimations") && names.contains("nyctophobia")
                && names.contains("omega-config") && names.contains("org_anarres_jcpp") && names.contains("org_antlr_antlr4-runtime")
                && names.contains("org_apache_commons_commons-math3") && names.contains("org_javassist_javassist") && names.contains("org_jetbrains_kotlin_kotlin-reflect")
                && names.contains("org_jetbrains_kotlin_kotlin-stdlib") && names.contains("org_jetbrains_kotlin_kotlin-stdlib-jdk7") && names.contains("org_jetbrains_kotlin_kotlin-stdlib-jdk8")
                && names.contains("org_jetbrains_kotlinx_atomicfu-jvm") && names.contains("org_jetbrains_kotlinx_kotlinx-coroutines-core-jvm") && names.contains("org_jetbrains_kotlinx_kotlinx-coroutines-jdk8")
                && names.contains("org_jetbrains_kotlinx_kotlinx-datetime-jvm") && names.contains("org_jetbrains_kotlinx_kotlinx-serialization-cbor-jvm") && names.contains("org_jetbrains_kotlinx_kotlinx-serialization-core-jvm")
                && names.contains("org_jetbrains_kotlinx_kotlinx-serialization-json-jvm") && names.contains("org_jgrapht_jgrapht-core") && names.contains("org_jheaps_jheaps")
                && names.contains("org_quiltmc_parsers_gson") && names.contains("org_quiltmc_parsers_json") && names.contains("org_reflections_reflections")
                && names.contains("overflowingbars") && names.contains("owo") && names.contains("packet_tweaker") && names.contains("paradise_lost")
                && names.contains("patchouli") && names.contains("physicsmod") && names.contains("placeholder-api") && names.contains("player-animator")
                && names.contains("playerabilitylib") && names.contains("polymer-blocks") && names.contains("polymer-bundled") && names.contains("polymer-common")
                && names.contains("polymer-core") && names.contains("polymer-networking") && names.contains("polymer-registry-sync-manipulator")
                && names.contains("polymer-resource-pack") && names.contains("polymer-virtual-entity") && names.contains("polymorph")
                && names.contains("porting_lib_accessors") && names.contains("porting_lib_attributes") && names.contains("porting_lib_base")
                && names.contains("porting_lib_brewing") && names.contains("porting_lib_client_events") && names.contains("porting_lib_common")
                && names.contains("porting_lib_config") && names.contains("porting_lib_core") && names.contains("porting_lib_data")
                && names.contains("porting_lib_entity") && names.contains("porting_lib_extensions") && names.contains("porting_lib_fluids")
                && names.contains("porting_lib_gametest") && names.contains("porting_lib_lazy_registration") && names.contains("porting_lib_loot")
                && names.contains("porting_lib_mixin_extensions") && names.contains("porting_lib_model_builders") && names.contains("porting_lib_model_generators")
                && names.contains("porting_lib_model_loader") && names.contains("porting_lib_model_materials") && names.contains("porting_lib_models")
                && names.contains("porting_lib_networking") && names.contains("porting_lib_obj_loader") && names.contains("porting_lib_registries")
                && names.contains("porting_lib_tags") && names.contains("porting_lib_tool_actions") && names.contains("porting_lib_transfer")
                && names.contains("porting_lib_utility") && names.contains("presencefootsteps") && names.contains("prioritytarget") && names.contains("puffish_skills")
                && names.contains("puzzlesaccessapi") && names.contains("puzzleslib") && names.contains("reach-entity-attributes") && names.contains("reeses-sodium-options")
                && names.contains("registrate-fabric") && names.contains("reinfchest") && names.contains("reinfcore") && names.contains("replaymod")
                && names.contains("resourcefulconfig") && names.contains("resourcefullib") && names.contains("revelationary") && names.contains("reverb")
                && names.contains("rhino") && names.contains("roughlyenoughitems") && names.contains("rpgdifficulty") && names.contains("seasons")
                && names.contains("seasonsextras") && names.contains("server_translations_api") && names.contains("servercore") && names.contains("serverpingerfixer")
                && names.contains("shetiphiancore") && names.contains("shouldersurfing") && names.contains("simpleprivatechest") && names.contains("smartbrainlib")
                && names.contains("smoothswapping") && names.contains("sodium") && names.contains("sodium-extra") && names.contains("soulsweapons")
                && names.contains("spark") && names.contains("spectrelib") && names.contains("spectrum") && names.contains("spoornbountymobs") && names.contains("spruceui")
                && names.contains("step-height-entity-attribute") && names.contains("supermartijn642configlib") && names.contains("supermartijn642corelib")
                && names.contains("tcdcommons") && names.contains("team_reborn_energy") && names.contains("tectonic") && names.contains("tenshilib")
                && names.contains("terrablender") && names.contains("threadtweak") && names.contains("tlc") && names.contains("tooltipfix") && names.contains("torchbowmod")
                && names.contains("torohealth") && names.contains("trinkets") && names.contains("twilightforest") && names.contains("villagesandpillages")
                && names.contains("voidz") && names.contains("wi_zoom") && names.contains("wthit") && names.contains("xaerominimap") && names.contains("xaeroworldmap")
                && names.contains("xlpackets") && names.contains("yet_another_config_lib_v3") && names.contains("yungsapi") && names.contains("yungsbridges")
                && names.contains("zombiehorsespawn") && names.size() == 366;
    }

    public boolean server(Collection<String> names) {
        return names.contains("achiopt") && names.contains("ad_astra") && names.contains("additionalentityattributes") && names.contains("advancedbackups")
                && names.contains("adventurez") && names.contains("ae2") && names.contains("aftershock") && names.contains("aliveandwell")
                && names.contains("alternate-current") && names.contains("antixray") && names.contains("anvilrestoration") && names.contains("appleskin")
                && names.contains("arachnids") && names.contains("architectury") && names.contains("arrowhead") && names.contains("attributefix")
                && names.contains("awesomedungeon") && names.contains("awesomedungeonnether") && names.contains("azurelib") && names.contains("badpackets")
                && names.contains("balm-fabric") && names.contains("benched") && names.contains("bettercombat") && names.contains("betterfpsdist")
                && names.contains("betterstats") && names.contains("blue_endless_jankson") && names.contains("bookshelf") && names.contains("bosses_of_mass_destruction")
                && names.contains("botania") && names.contains("botarium") && names.contains("bowinfinityfix") && names.contains("cardinal-components")
                && names.contains("cardinal-components-base") && names.contains("cardinal-components-block") && names.contains("cardinal-components-chunk")
                && names.contains("cardinal-components-entity") && names.contains("cardinal-components-item") && names.contains("cardinal-components-level")
                && names.contains("cardinal-components-scoreboard") && names.contains("cardinal-components-world") && names.contains("cavespiderspawn")
                && names.contains("charmofundying") && names.contains("chunky") && names.contains("cleancut") && names.contains("cloth-basic-math")
                && names.contains("cloth-config") && names.contains("collective") && names.contains("com_electronwill_night-config_core") && names.contains("com_electronwill_night-config_toml")
                && names.contains("com_eliotlash_mclib_mclib") && names.contains("com_google_code_findbugs_jsr305") && names.contains("com_moandjiezana_toml_toml4j")
                && names.contains("com_teamresourceful_bytecodecs") && names.contains("com_teamresourceful_yabn") && names.contains("com_twelvemonkeys_common_common-image")
                && names.contains("com_twelvemonkeys_common_common-io") && names.contains("com_twelvemonkeys_common_common-lang") && names.contains("com_twelvemonkeys_imageio_imageio-core")
                && names.contains("com_twelvemonkeys_imageio_imageio-metadata") && names.contains("com_twelvemonkeys_imageio_imageio-webp") && names.contains("com_velocitypowered_velocity-native")
                && names.contains("combatroll") && names.contains("configuration") && names.contains("connectivity") && names.contains("coroutil") && names.contains("create")
                && names.contains("createaddition") && names.contains("creeperoverhaul") && names.contains("cupboard") && names.contains("cursery") && names.contains("customportalapi")
                && names.contains("darkfear") && names.contains("deeperdarker") && names.contains("diet") && names.contains("doom") && names.contains("dragonfight") && names.contains("dragonloot")
                && names.contains("dripstone_fluid_lib") && names.contains("dungeons_arise") && names.contains("dungeons_arise_seven_seas") && names.contains("earthtojavamobs")
                && names.contains("eldritch_mobs") && names.contains("elytraslot") && names.contains("endrem") && names.contains("error_notifier") && names.contains("euphonium") && names.contains("extendedae")
                && names.contains("extensibleenums") && names.contains("fabric-api") && names.contains("fabric-api-base") && names.contains("fabric-api-lookup-api-v1") && names.contains("fabric-biome-api-v1")
                && names.contains("fabric-block-api-v1") && names.contains("fabric-block-view-api-v2") && names.contains("fabric-command-api-v1") && names.contains("fabric-command-api-v2")
                && names.contains("fabric-commands-v0") && names.contains("fabric-containers-v0") && names.contains("fabric-content-registries-v0") && names.contains("fabric-convention-tags-v1")
                && names.contains("fabric-crash-report-info-v1") && names.contains("fabric-data-attachment-api-v1") && names.contains("fabric-data-generation-api-v1") && names.contains("fabric-dimensions-v1")
                && names.contains("fabric-entity-events-v1") && names.contains("fabric-events-interaction-v0") && names.contains("fabric-events-lifecycle-v0") && names.contains("fabric-game-rule-api-v1")
                && names.contains("fabric-item-api-v1") && names.contains("fabric-item-group-api-v1") && names.contains("fabric-language-kotlin") && names.contains("fabric-lifecycle-events-v1")
                && names.contains("fabric-loot-api-v2") && names.contains("fabric-loot-tables-v1") && names.contains("fabric-message-api-v1") && names.contains("fabric-mining-level-api-v1")
                && names.contains("fabric-networking-api-v1") && names.contains("fabric-networking-v0") && names.contains("fabric-object-builder-api-v1") && names.contains("fabric-particles-v1")
                && names.contains("fabric-permissions-api-v0") && names.contains("fabric-recipe-api-v1") && names.contains("fabric-registry-sync-v0") && names.contains("fabric-rendering-data-attachment-v1")
                && names.contains("fabric-rendering-fluids-v1") && names.contains("fabric-resource-conditions-api-v1") && names.contains("fabric-resource-loader-v0")
                && names.contains("fabric-screen-handler-api-v1") && names.contains("fabric-transfer-api-v1") && names.contains("fabric-transitive-access-wideners-v1") && names.contains("fabricloader")
                && names.contains("fabricshieldlib") && names.contains("ferritecore") && names.contains("fiber") && names.contains("folk_sisby_kaleido-config") && names.contains("forgeconfigapiport")
                && names.contains("fractal") && names.contains("ftblibrary") && names.contains("ftbquests") && names.contains("ftbteams") && names.contains("ftbxmodcompat") && names.contains("geckolib")
                && names.contains("gitbm") && names.contains("gpumemleakfix") && names.contains("human_reborn") && names.contains("huskspawn") && names.contains("illagerinvasion")
                && names.contains("immersive_aircraft") && names.contains("immersive_melodies") && names.contains("improvedmobs") && names.contains("imst") && names.contains("inmis")
                && names.contains("inmisaddon") && names.contains("java") && names.contains("javax_annotation_javax_annotation-api") && names.contains("javazoom_jlayer") && names.contains("kaffees_dual_ride")
                && names.contains("krypton") && names.contains("kubejs") && names.contains("lanserverproperties") && names.contains("levelz") && names.contains("libraryferret") && names.contains("libz")
                && names.contains("lithium") && names.contains("lootr") && names.contains("lunar") && names.contains("maelstrom_library") && names.contains("magna") && names.contains("matchbooks")
                && names.contains("mc249136") && names.contains("mcdw") && names.contains("memoryclearermissnotoredict") && names.contains("memoryleakfix") && names.contains("midnightlib")
                && names.contains("milk") && names.contains("minecells") && names.contains("minecraft") && names.contains("mixinextras") && names.contains("mm") && names.contains("mobtimizations")
                && names.contains("mobz") && names.contains("modern_industrialization") && names.contains("modernfix") && names.contains("modifiers") && names.contains("monolib")
                && names.contains("movingelevators") && names.contains("mr_camps_castles_carriages") && names.contains("mr_reds_morestructures") && names.contains("mr_ships") && names.contains("mr_true_ending")
                && names.contains("multipart_entities") && names.contains("mythicmounts") && names.contains("nametagtweaks") && names.contains("nebulus_cherry_blossem_tree") && names.contains("nice_boat")
                && names.contains("noisium") && names.contains("notenoughanimations") && names.contains("nyctophobia") && names.contains("omega-config") && names.contains("org_apache_commons_commons-math3")
                && names.contains("org_javassist_javassist") && names.contains("org_jetbrains_kotlin_kotlin-reflect") && names.contains("org_jetbrains_kotlin_kotlin-stdlib")
                && names.contains("org_jetbrains_kotlin_kotlin-stdlib-jdk7") && names.contains("org_jetbrains_kotlin_kotlin-stdlib-jdk8") && names.contains("org_jetbrains_kotlinx_atomicfu-jvm")
                && names.contains("org_jetbrains_kotlinx_kotlinx-coroutines-core-jvm") && names.contains("org_jetbrains_kotlinx_kotlinx-coroutines-jdk8") && names.contains("org_jetbrains_kotlinx_kotlinx-datetime-jvm")
                && names.contains("org_jetbrains_kotlinx_kotlinx-serialization-cbor-jvm") && names.contains("org_jetbrains_kotlinx_kotlinx-serialization-core-jvm") && names.contains("org_jetbrains_kotlinx_kotlinx-serialization-json-jvm")
                && names.contains("org_jgrapht_jgrapht-core") && names.contains("org_jheaps_jheaps") && names.contains("org_quiltmc_parsers_gson") && names.contains("org_quiltmc_parsers_json")
                && names.contains("org_reflections_reflections") && names.contains("owo") && names.contains("packet_tweaker") && names.contains("paradise_lost") && names.contains("patchouli")
                && names.contains("physicsmod") && names.contains("placeholder-api") && names.contains("player-animator") && names.contains("playerabilitylib") && names.contains("polymer-autohost")
                && names.contains("polymer-blocks") && names.contains("polymer-bundled") && names.contains("polymer-common") && names.contains("polymer-core") && names.contains("polymer-networking")
                && names.contains("polymer-registry-sync-manipulator") && names.contains("polymer-resource-pack") && names.contains("polymer-virtual-entity") && names.contains("polymorph")
                && names.contains("porting_lib_accessors") && names.contains("porting_lib_attributes") && names.contains("porting_lib_base") && names.contains("porting_lib_brewing")
                && names.contains("porting_lib_client_events") && names.contains("porting_lib_common") && names.contains("porting_lib_config") && names.contains("porting_lib_core")
                && names.contains("porting_lib_data") && names.contains("porting_lib_entity") && names.contains("porting_lib_extensions") && names.contains("porting_lib_fluids")
                && names.contains("porting_lib_gametest") && names.contains("porting_lib_lazy_registration") && names.contains("porting_lib_loot") && names.contains("porting_lib_mixin_extensions")
                && names.contains("porting_lib_model_builders") && names.contains("porting_lib_model_generators") && names.contains("porting_lib_model_loader") && names.contains("porting_lib_model_materials")
                && names.contains("porting_lib_models") && names.contains("porting_lib_networking") && names.contains("porting_lib_obj_loader") && names.contains("porting_lib_registries")
                && names.contains("porting_lib_tags") && names.contains("porting_lib_tool_actions") && names.contains("porting_lib_transfer") && names.contains("porting_lib_utility")
                && names.contains("prioritytarget") && names.contains("puffish_skills") && names.contains("puzzlesaccessapi") && names.contains("puzzleslib") && names.contains("reach-entity-attributes")
                && names.contains("registrate-fabric") && names.contains("reinfchest") && names.contains("reinfcore") && names.contains("resourcefulconfig") && names.contains("resourcefullib")
                && names.contains("revelationary") && names.contains("reverb") && names.contains("rhino") && names.contains("roughlyenoughitems") && names.contains("rpgdifficulty") && names.contains("seasons")
                && names.contains("seasonsextras") && names.contains("server_translations_api") && names.contains("servercore") && names.contains("shetiphiancore") && names.contains("simpleprivatechest")
                && names.contains("smartbrainlib") && names.contains("soulsweapons") && names.contains("spark") && names.contains("spectrelib") && names.contains("spectrum") && names.contains("spoornbountymobs")
                && names.contains("step-height-entity-attribute") && names.contains("supermartijn642configlib") && names.contains("supermartijn642corelib") && names.contains("tcdcommons")
                && names.contains("team_reborn_energy") && names.contains("tectonic") && names.contains("tenshilib") && names.contains("terrablender") && names.contains("threadtweak") && names.contains("tlc")
                && names.contains("torchbowmod") && names.contains("trinkets") && names.contains("twilightforest") && names.contains("villagesandpillages") && names.contains("voidz") && names.contains("wthit")
                && names.contains("xaerominimap") && names.contains("xaeroworldmap") && names.contains("xlpackets") && names.contains("yet_another_config_lib_v3") && names.contains("yungsapi")
                && names.contains("yungsbridges") && names.contains("zombiehorsespawn") && names.size() == 313;
    }
    public boolean modrinth(Collection<String> names) {
        return names.contains("ad_astra") && names.contains("advanced_runtime_resource_pack") && names.contains("adventurez") && names.contains("ae2") && names.contains("aftershock")
                && names.contains("aliveandwell") && names.contains("alternate-current") && names.contains("appleskin") && names.contains("arachnids") && names.contains("architectury")
                && names.contains("attributefix") && names.contains("awesomedungeon") && names.contains("awesomedungeonnether") && names.contains("azurelib") && names.contains("badpackets")
                && names.contains("bclib") && names.contains("bettercombat") && names.contains("betterfpsdist") && names.contains("blue_endless_jankson") && names.contains("bosses_of_mass_destruction")
                && names.contains("botarium") && names.contains("caffeineconfig") && names.contains("cardinal-components") && names.contains("cardinal-components-base")
                && names.contains("cardinal-components-block") && names.contains("cardinal-components-chunk") && names.contains("cardinal-components-entity") && names.contains("cardinal-components-item")
                && names.contains("cardinal-components-level") && names.contains("cardinal-components-scoreboard") && names.contains("cardinal-components-world") && names.contains("carryon")
                && names.contains("charmofundying") && names.contains("chunky") && names.contains("cleancut") && names.contains("cloth-basic-math") && names.contains("cloth-config")
                && names.contains("collective") && names.contains("com_electronwill_night-config_core") && names.contains("com_electronwill_night-config_toml") && names.contains("com_eliotlash_mclib_mclib")
                && names.contains("com_github_llamalad7_mixinextras") && names.contains("com_teamresourceful_bytecodecs") && names.contains("com_teamresourceful_yabn")
                && names.contains("com_twelvemonkeys_common_common-image") && names.contains("com_twelvemonkeys_common_common-io") && names.contains("com_twelvemonkeys_common_common-lang")
                && names.contains("com_twelvemonkeys_imageio_imageio-core") && names.contains("com_twelvemonkeys_imageio_imageio-metadata") && names.contains("com_twelvemonkeys_imageio_imageio-webp")
                && names.contains("com_velocitypowered_velocity-native") && names.contains("combatroll") && names.contains("common-protection-api") && names.contains("config_toolkit")
                && names.contains("connectivity") && names.contains("corgilib") && names.contains("creeperoverhaul") && names.contains("crowdin-translate") && names.contains("cull-less-leaves")
                && names.contains("cupboard") && names.contains("customportalapi") && names.contains("darkfear") && names.contains("diet") && names.contains("disable_custom_worlds_advice")
                && names.contains("doom") && names.contains("dragonfight") && names.contains("earthtojavamobs") && names.contains("elytraslot") && names.contains("endrem")
                && names.contains("enhancedblockentities") && names.contains("entity_model_features") && names.contains("entity_texture_features") && names.contains("enhancedcelestials")
                && names.contains("entityculling") && names.contains("explosiveenhancement") && names.contains("extended_drawers") && names.contains("extra_details") && names.contains("fabric-api")
                && names.contains("fabric-api-base") && names.contains("fabric-api-lookup-api-v1") && names.contains("fabric-biome-api-v1") && names.contains("fabric-block-api-v1")
                && names.contains("fabric-block-view-api-v2") && names.contains("fabric-blockrenderlayer-v1") && names.contains("fabric-client-tags-api-v1") && names.contains("fabric-command-api-v1")
                && names.contains("fabric-command-api-v2") && names.contains("fabric-commands-v0") && names.contains("fabric-containers-v0") && names.contains("fabric-content-registries-v0")
                && names.contains("fabric-convention-tags-v1") && names.contains("fabric-crash-report-info-v1") && names.contains("fabric-data-generation-api-v1") && names.contains("fabric-dimensions-v1")
                && names.contains("fabric-entity-events-v1") && names.contains("fabric-events-interaction-v0") && names.contains("fabric-events-lifecycle-v0") && names.contains("fabric-game-rule-api-v1")
                && names.contains("fabric-item-api-v1") && names.contains("fabric-item-group-api-v1") && names.contains("fabric-key-binding-api-v1") && names.contains("fabric-keybindings-v0")
                && names.contains("fabric-language-kotlin") && names.contains("fabric-lifecycle-events-v1") && names.contains("fabric-loot-api-v2") && names.contains("fabric-loot-tables-v1")
                && names.contains("fabric-message-api-v1") && names.contains("fabric-mining-level-api-v1") && names.contains("fabric-model-loading-api-v1") && names.contains("fabric-models-v0")
                && names.contains("fabric-networking-api-v1") && names.contains("fabric-networking-v0") && names.contains("fabric-object-builder-api-v1") && names.contains("fabric-particles-v1")
                && names.contains("fabric-permissions-api-v0") && names.contains("fabric-recipe-api-v1") && names.contains("fabric-registry-sync-v0") && names.contains("fabric-renderer-api-v1")
                && names.contains("fabric-renderer-indigo") && names.contains("fabric-renderer-registries-v1") && names.contains("fabric-rendering-data-attachment-v1")
                && names.contains("fabric-rendering-fluids-v1") && names.contains("fabric-rendering-v0") && names.contains("fabric-rendering-v1") && names.contains("fabric-resource-conditions-api-v1")
                && names.contains("fabric-resource-loader-v0") && names.contains("fabric-screen-api-v1") && names.contains("fabric-screen-handler-api-v1") && names.contains("fabric-sound-api-v1")
                && names.contains("fabric-transfer-api-v1") && names.contains("fabric-transitive-access-wideners-v1") && names.contains("fabricloader") && names.contains("faster_entity_animations")
                && names.contains("ferritecore") && names.contains("fiber") && names.contains("ftblibrary") && names.contains("ftbquests") && names.contains("ftbteams") && names.contains("geckolib")
                && names.contains("gitbm") && names.contains("gpumemleakfix") && names.contains("graphlib") && names.contains("hashs_falcons_mr") && names.contains("human_reborn") && names.contains("huskspawn")
                && names.contains("hwg") && names.contains("immediatelyfast") && names.contains("immersive_aircraft") && names.contains("improvedmobs") && names.contains("imst") && names.contains("indium")
                && names.contains("inventoryhud") && names.contains("inventoryprofilesnext") && names.contains("io_determann_shadow-api-17") && names.contains("io_github_douira_glsl-transformer")
                && names.contains("iris") && names.contains("ironchests") && names.contains("itemfilters") && names.contains("java") && names.contains("kaffees_dual_ride") && names.contains("kambrik")
                && names.contains("kirin") && names.contains("kmodlib-overlay") && names.contains("krypton") && names.contains("kubejs") && names.contains("lanserverproperties") && names.contains("levelz")
                && names.contains("libipn") && names.contains("libnetworkstack") && names.contains("libraryferret") && names.contains("libz") && names.contains("libzoomer") && names.contains("lithium")
                && names.contains("lootr") && names.contains("maelstrom_library") && names.contains("magna") && names.contains("mc249136") && names.contains("mcdw") && names.contains("minecells")
                && names.contains("minecraft") && names.contains("modern_industrialization") && names.contains("modernfix") && names.contains("modmenu") && names.contains("multipart_entities")
                && names.contains("mythicmounts") && names.contains("nametagtweaks") && names.contains("nckey") && names.contains("net_fabricmc_javapoet") && names.contains("net_lenni0451_reflect")
                && names.contains("nicer-skies") && names.contains("no-telemetry") && names.contains("noindium") && names.contains("notenoughanimations") && names.contains("nyctophobia")
                && names.contains("omega-config") && names.contains("org_anarres_jcpp") && names.contains("org_antlr_antlr4-runtime") && names.contains("org_apache_commons_commons-math3")
                && names.contains("org_apache_httpcomponents_httpmime") && names.contains("org_javassist_javassist") && names.contains("org_jetbrains_kotlin_kotlin-reflect")
                && names.contains("org_jetbrains_kotlin_kotlin-stdlib") && names.contains("org_jetbrains_kotlin_kotlin-stdlib-jdk7") && names.contains("org_jetbrains_kotlin_kotlin-stdlib-jdk8")
                && names.contains("org_jetbrains_kotlinx_atomicfu-jvm") && names.contains("org_jetbrains_kotlinx_kotlinx-coroutines-core-jvm") && names.contains("org_jetbrains_kotlinx_kotlinx-coroutines-jdk8")
                && names.contains("org_jetbrains_kotlinx_kotlinx-datetime-jvm") && names.contains("org_jetbrains_kotlinx_kotlinx-serialization-cbor-jvm") && names.contains("org_jetbrains_kotlinx_kotlinx-serialization-core-jvm")
                && names.contains("org_jetbrains_kotlinx_kotlinx-serialization-json-jvm") && names.contains("org_reflections_reflections") && names.contains("owo") && names.contains("packedup")
                && names.contains("packet_tweaker") && names.contains("patchouli") && names.contains("player-animator") && names.contains("playerabilitylib") && names.contains("polymer-blocks")
                && names.contains("polymer-bundled") && names.contains("polymer-common") && names.contains("polymer-core") && names.contains("polymer-networking") && names.contains("polymer-registry-sync-manipulator")
                && names.contains("polymer-resource-pack") && names.contains("polymer-virtual-entity") && names.contains("polymorph") && names.contains("presencefootsteps") && names.contains("puffish_skills")
                && names.contains("reach-entity-attributes") && names.contains("reeses-sodium-options") && names.contains("resourcefulconfig") && names.contains("resourcefulconfig199a") && names.contains("resourcefullib")
                && names.contains("rhino") && names.contains("rpgdifficulty") && names.contains("senguiengling") && names.contains("simpleprivatechest") && names.contains("smartbrainlib") && names.contains("sodium")
                && names.contains("sodium-extra") && names.contains("soulsweapons") && names.contains("spark") && names.contains("spectrelib") && names.contains("spoornbountymobs") && names.contains("spruceui")
                && names.contains("starlight") && names.contains("supermartijn642configlib") && names.contains("supermartijn642corelib") && names.contains("team_reborn_energy") && names.contains("tectonic")
                && names.contains("tenshilib") && names.contains("terrablender") && names.contains("terralith") && names.contains("tlc") && names.contains("tooltipfix") && names.contains("torchbowmod")
                && names.contains("trinkets") && names.contains("uselessreptile") && names.contains("veinmining") && names.contains("voidz") && names.contains("watching") && names.contains("wi_zoom")
                && names.contains("wthit") && names.contains("xaerominimap") && names.contains("xaeroworldmap") && names.contains("yet_another_config_lib_v3") && names.contains("yungsapi")
                && names.contains("yungsbridges") && names.contains("zombiehorsespawn") && names.size() == 274;
    }
}
