package main
import (
    "fmt"
    "bufio"
    "os"
    "strconv"
    "strings"
)
func main() {
 bio := bufio.NewReader(os.Stdin)
 line, _ := bio.ReadString('\n')
 if line[len(line)-1] == '\n' {
    line = line[:len(line)-1] 
 }
 num, _ := strconv.Atoi(line)
 count := num -2
 for i := -2; i < num; i++ {
     current := []string{}
     for j := 0; j < num; j++ {
         if j <= count {
            current = append(current, " ")
         } else if count <= -2 {
            break
         } else {
            current = append(current, "#")
         }
     }
     count -= 1
     printed := strings.Join(current, "")
     fmt.Println(printed)
 }
}