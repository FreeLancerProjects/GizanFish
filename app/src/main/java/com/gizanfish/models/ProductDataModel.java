package com.gizanfish.models;

import java.io.Serializable;
import java.util.List;

public class ProductDataModel implements Serializable {
    private List<SingleProductDataModel> data;

    public List<SingleProductDataModel> getData() {
        return data;
    }


//    public static class Data implements Serializable {
//        private int id;
//        private String title;
//        private String image;
//        private int departemnt_id;
//        private int markter_id;
//        private double price;
//        private String content;
//        private String details;
//        private String features;
//        private String model;
//        private double offer_value;
//        private String offer_type;
//        private String have_offer;
//        private String product_type;
//        private double old_price;
//        private Department department_fk;
//        private List<ProductsImages> products_images;
//        private UserLike user_like;
//
//        public int getId() {
//            return id;
//        }
//
//        public String getTitle() {
//            return title;
//        }
//
//        public String getImage() {
//            return image;
//        }
//
//        public int getDepartemnt_id() {
//            return departemnt_id;
//        }
//
//        public int getMarkter_id() {
//            return markter_id;
//        }
//
//        public double getPrice() {
//            return price;
//        }
//
//        public String getContent() {
//            return content;
//        }
//
//        public String getDetails() {
//            return details;
//        }
//
//        public String getFeatures() {
//            return features;
//        }
//
//        public String getModel() {
//            return model;
//        }
//
//        public double getOffer_value() {
//            return offer_value;
//        }
//
//        public String getOffer_type() {
//            return offer_type;
//        }
//
//        public String getHave_offer() {
//            return have_offer;
//        }
//
//        public String getProduct_type() {
//            return product_type;
//        }
//
//        public double getOld_price() {
//            return old_price;
//        }
//
//        public Department getDepartment_fk() {
//            return department_fk;
//        }
//
//        public List<ProductsImages> getProducts_images() {
//            return products_images;
//        }
//
//        public UserLike getUser_like() {
//            return user_like;
//        }
//
//        public class Department implements Serializable {
//            private int id;
//            private String title;
//            private String background;
//            private String image;
//            private String icon;
//            private String parent;
//            private int level;
//
//            public int getId() {
//                return id;
//            }
//
//            public String getTitle() {
//                return title;
//            }
//
//            public String getBackground() {
//                return background;
//            }
//
//            public String getImage() {
//                return image;
//            }
//
//            public String getIcon() {
//                return icon;
//            }
//
//            public String getParent() {
//                return parent;
//            }
//
//            public int getLevel() {
//                return level;
//            }
//        }
//
//        public class ProductsImages implements Serializable {
//            private int id;
//            private String image;
//            private int product_id;
//
//            public int getId() {
//                return id;
//            }
//
//            public String getImage() {
//                return image;
//            }
//
//            public int getProduct_id() {
//                return product_id;
//            }
//        }
//
//        public class UserLike implements Serializable {
//
//        }
//    }
}
