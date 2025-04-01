package motivation.entity;

public class Motivation {

        private int id;
        private String body;
        private String source;
    
        public int getId() {
            return this.id;
        }
    
        public void setId(int id) {
            this.id = id;
        }
    
        public String getBody() {
            return this.body;
        }
    
        public void setBody(String body) {
            this.body = body;
        }
    
        public String getSource() {
            return this.source;
        }
    
        public void setSource(String source) {
            this.source = source;
        }
    
    
        public Motivation(int id, String body, String source) {
            this.id = id;
            this.body = body;
            this.source = source;
        }
    
        @Override
        public String toString() {
            return "Motivation{" +
                " id='" + id + "'" +
                ", body='" + body + "'" +
                ", source='" + source + "'" +
                "}";
        }
    
    
}
