#include <iostream>
// важный импорт
#include <fstream>

using namespace std;

int main() {
  // создаем поток ввода
	ifstream in("garland.in");
  // поток вывода
	ofstream out("garland.out");
	int n;
	
	in >> n;
  out << n;
	
	
  return 0;
}
