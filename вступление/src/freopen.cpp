#include <iostream>
using  namespace std;

int main() {
    int w,h;
    // перенаправить поток ввода на файл
    // turtle.in - имя файла
    // r - режим (в данном случае read) остальные режимы можно тут посмотреть http://cppstudio.com/post/1257/
    // stdin - поток, который меняем. В нашем случае - поток ввода
    freopen("turtle.in","r",stdin);
    cin>>h>>w;

    // перенаправить поток вывода в файл
    freopen("turtle.out","w",stdout);
    cout << h << " " << w;
    return 0;
}
