package main
import (
    "fmt"
    "bufio"
    "os"
    "strconv"
    "strings"
    "math"
)
func main() {
 bio := bufio.NewReader(os.Stdin)
 line, _ := bio.ReadString('\n')
 if line[len(line)-1] == '\n' {
    line = line[:len(line)-1] 
 }
 nkq := strings.Split(line, " ")
 n, _:= strconv.Atoi(nkq[0])
 k, _ := strconv.Atoi(nkq[1])
 q, _ := strconv.Atoi(nkq[2])
 line, _ = bio.ReadString('\n')
 if line[len(line)-1] == '\n' {
    line = line[:len(line)-1] 
 }
 array := strings.Split(line, " ")
 k = int(math.Mod(float64(k), float64(n)))
 placeholder := append([]string{}, array[n-k:]...)
 placeholder = append(placeholder, array[:n-k]...)
 array = placeholder
 for i := 0; i < q; i++ {
    line, _ := bio.ReadString('\n')
    if line[len(line)-1] == '\n' {
        line = line[:len(line)-1] 
    }
    current, _ := strconv.Atoi(line)
    fmt.Printf("%v\n", array[current])
 }
}