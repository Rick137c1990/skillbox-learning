# Computer Components Simulation (Java)  

This is a simple educational project written in Java that demonstrates object-oriented programming concepts such as:  
- Encapsulation
- Immutability (using `final` and immutable setters returning new objects)  
- Composition (a `Computer` consists of CPU, RAM, Memory, Screen, and Keyboard)  
- Enums for predefined types of hardware components  

---

## Project Structure  

- **CPU** – represents a processor with frequency, number of cores, manufacturer, and weight.  
- **RAM** – represents random access memory with type, volume, and weight.  
- **Memory** – represents storage (HDD/SSD) with type, capacity, and weight.  
- **Screen** – represents a display with type, diagonal, and weight.  
- **Keyboard** – represents a keyboard with type, backlight option, and weight.  
- **Computer** – aggregates all the components into a single computer model.  
- **Enums**:  
  - `TypeCPU` – CPU manufacturers (AMD, INTEL)  
  - `TypeRAM` – RAM types (DDR3, DDR4, DDR4 SDRAM)  
  - `TypeMemory` – storage types (HDD, SSD)  
  - `TypeScreen` – screen types (IPS, TN, VA)  
  - `TypeKeyboard` – keyboard types  

---

## Example Usage

```java
public class Main {
    public static void main(String[] args) {
        CPU cpu = new CPU(220.3, 4, TypeCPU.AMD, 0.340);
        RAM ram = new RAM(TypeRAM.DDR_3, 8, 0.140);
        Memory memory = new Memory(TypeMemory.HDD, 16, 0.640);
        Screen screen = new Screen(TypeScreen.VA, 12, 2.54);
        Keyboard keyboard = new Keyboard(TypeKeyboard.MEMBRANE, false, 0.980);

        Computer computer = new Computer("Acer", "748kdk", cpu, ram, memory, screen, keyboard);
        System.out.println(computer);

        System.out.println("Total weight: " + computer.calcWeight() + " kg");

        // Updating CPU manufacturer immutably
        computer.setCpu(cpu.setManufacturer(TypeCPU.INTEL));
        System.out.println(computer);
    }
}
Example Output
VENDOR: Acer
----------------------------
MODEL: 748kdk
----------------------------
CPU
frequency: 220.3 Hz
number of cores: 4
manufacturer: AMD
weight: 0.34 kg
----------------------------
RAM
type: DDR_3
volume: 8 GB
weight: 0.14 kg
----------------------------
STORAGE
type: HDD
capacity: 16 GB
weight: 0.64 kg
----------------------------
SCREEN
type: VA
diagonal: 12 inches
weight: 2.54 kg
----------------------------
KEYBOARD
type: MEMBRANE
backlight: no
weight: 0.98 kg

Total weight: 4.65 kg
```
---
The repository exists purely as a learning and demonstration artifact.  

