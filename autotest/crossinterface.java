interface crossinterface{
  void begin(char symbol); //lubatud O ja X
  char turn();
  void place(char symbol, int line, int column);
  char ask(int line, int column);
}
