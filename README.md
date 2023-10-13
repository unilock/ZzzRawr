# zzz... rrr... Rawr?

Server-side mod that sends a (configurable) message to chat when it's time to wake up.

The config file can be found at `config/zzz_rawr/config.toml`. This is what it looks like by default:
```toml
# List of messages to send (one will be chosen at random)
messages = [
	"Wakey, wakey, rise and shine... Good Morning everyone!",
	"zzz... rrr... Rawr?"
]
```
You can add or remove messages here as you see fit, following the [TOML specification](https://toml.io/en/) for an array of strings.  
Then, every time players awaken from sleep, one of the defined messages will be broadcast to chat globally.

Inspired by the same feature found in the classic mod [Morpheus](https://www.curseforge.com/minecraft/mc-mods/morpheus), with the title borrowed from that mod's config in ReikaKalseki's [DragonRealm](https://dragonrealm.overminddl1.com/).
