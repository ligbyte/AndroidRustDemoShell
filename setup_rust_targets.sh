#!/bin/bash

# 设置 Rust Android 编译目标的脚本
# 运行此脚本以添加 Android 交叉编译支持

echo "正在设置 Rust Android 编译目标..."

# 安装 cargo ndk
cargo install cargo-ndk

# 添加 Android 编译目标
rustup target add aarch64-linux-android
rustup target add armv7-linux-androideabi
rustup target add i686-linux-android
rustup target add x86_64-linux-android


rustup target add x86_64-unknown-linux-gnu  
rustup target add x86_64-apple-darwin       
rustup target add aarch64-apple-darwin      
rustup target add x86_64-pc-windows-gnu    
rustup target add x86_64-pc-windows-msvc 
...

echo "已添加以下 Android 编译目标:"
echo "- aarch64-linux-android (ARM 64-bit)"
echo "- armv7-linux-androideabi (ARM 32-bit)"
echo "- i686-linux-android (x86 32-bit)"
echo "- x86_64-linux-android (x86 64-bit)"

echo ""
echo "请确保已安装 Android NDK 并设置了以下环境变量:"
echo "export ANDROID_NDK_HOME=/path/to/your/ndk"
echo "export ANDROID_NDK_ROOT=/path/to/your/ndk"
echo ""
echo "设置完成后，可以运行以下命令编译 Rust 库:"
echo "cd rust && cargo build --target aarch64-linux-android --release"
