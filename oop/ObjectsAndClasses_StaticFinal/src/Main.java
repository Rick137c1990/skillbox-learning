public class Main {
    public static void main(String[] args) {
        CPU cpu = new CPU(220.3, 4, TypeCPU.AMD, 0.340);
        RAM ram = new RAM(TypeRAM.DDR_3, 8, 0.140);
        Memory memory = new Memory(TypeMemory.HDD, 16, 0.640);
        Screen screen = new Screen(TypeScreen.VA, 12, 2.54);
        Keyboard keyboard = new Keyboard(TypeKeyboard.MEMBRANE, false, 0.980);

        Computer computer = new Computer("Acer", "748kdk", cpu, ram, memory, screen, keyboard);
        System.out.println(computer);

        System.out.println(computer.calcWeight());
        computer.setCpu(cpu.setManufacturer(TypeCPU.INTEL));
        System.out.println(computer);
    }
}