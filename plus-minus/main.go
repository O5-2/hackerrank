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
 list := []int{}
 line, _ = bio.ReadString('\n')
 if line[len(line)-1] == '\n' {
    line = line[:len(line)-1] 
 }
 rename := strings.Split(line, " ")
 for i := 0; i < num; i++ {
     current, _ := strconv.Atoi(rename[i])
     list = append(list, current)
 }
 var pos float32
 pos_count := 0
 var neg float32
 neg_count := 0
 var zero float32
 zero_count := 0
 for i := 0; i < num; i++ {
     if list[i] > 0 {
         pos_count += 1
     } else if list[i] < 0 {
         neg_count += 1
     } else {
         zero_count += 1
     }
 }
 pos = float32(pos_count)/float32(num)
 neg = float32(neg_count)/float32(num)
 zero = float32(zero_count)/float32(num)
 fmt.Printf("%v\n", pos)
 fmt.Printf("%v\n", neg)
 fmt.Printf("%v\n", zero)
}