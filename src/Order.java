import java.text.SimpleDateFormat;
import java.util.Date;

class Order {
        private Long orderId = System.currentTimeMillis();
        private Integer productId;
        private String productName;
        private Float amount;
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date1 = new Date();
        private String date = formatter.format(date1);
        private Integer quantity;

        public Order() {
        }

        public Long getOrderId() {
            return orderId;
        }

        public void setOrderId(Long orderId) {
            this.orderId = orderId;
        }

        public Integer getProductId() {
            return productId;
        }

        public void setProductId(Integer productId) {
            this.productId = productId;
        }

        public Float getAmount() {
            return amount;
        }

        public void setAmount(Float amount) {
            this.amount = amount;
        }

        public SimpleDateFormat getFormatter() {
            return formatter;
        }

        public void setFormatter(SimpleDateFormat formatter) {
            this.formatter = formatter;
        }

        public Date getDate1() {
            return date1;
        }

        public void setDate1(Date date1) {
            this.date1 = date1;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public Integer getQuantity() {
            return quantity;
        }

        public void setQuantity(Integer quantity) {
            this.quantity = quantity;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public Order(String productName, Integer productId, Float amount, Integer quantity) {
            this.productName = productName;
            this.productId = productId;
            this.amount = amount;
            this.quantity = quantity;
        }

}
