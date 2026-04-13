package oop_110834_StaveyJeremyLahindah.Latihan_UTS.Week06

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device : SmartDevice){
        devices.add(device)
    }

    fun turnOffAllSwitches(){
        for (device in devices){
            if (device is Switchable){
                device.turnOff()
            }
        }
    }

    fun activateSecurityMode() {
        for (device in devices){
            if (device is Recordable){
                device.startRecord()
            } else if (device is SmartSpeaker){
                device.playMusic("AIZO")
            }
        }
    }
}